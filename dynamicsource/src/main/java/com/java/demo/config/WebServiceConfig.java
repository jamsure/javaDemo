package com.java.demo.config;

import com.java.demo.webservice.WebServiceService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @ClassName WebServiceConfig
 * @Description TODO
 * @Date 2019/7/25 19:38
 * @Author fankai
 * @Version 1.0
 **/
@Configuration
public class WebServiceConfig {

    @Autowired
    private WebServiceService webServiceService;

    /**
     * 注入servlet  bean name不能dispatcherServlet 否则会覆盖dispatcherServlet
     * @return
     */
    @Bean(name = "cxfServlet")
    public ServletRegistrationBean cxfServlet() {
        return new ServletRegistrationBean(new CXFServlet(),"/ws/*");
    }


    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    /**
     * 注册WebServiceDemoService接口到webservice服务
     * @return
     */
    @Bean(name = "WebServiceEndpoint")
    public Endpoint sweptPayEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), webServiceService);
        endpoint.publish("/webservice");
        return endpoint;
    }
}
