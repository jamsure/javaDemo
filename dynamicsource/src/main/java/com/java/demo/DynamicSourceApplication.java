package com.java.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @ClassName DynamicSourceApplication
 * @Description TODO
 * @Date 2019/7/25 17:21
 * @Author fankai
 * @Version 1.0
 **/
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
@MapperScan("com.java.demo.mapper")
@ServletComponentScan
public class DynamicSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicSourceApplication.class, args);
    }
}
