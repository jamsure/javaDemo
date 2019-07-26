package com.java.demo.webservice.impl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PascalNameFilter;
import com.java.demo.mapper.TbCameraMapper;
import com.java.demo.webservice.WebServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;
import java.util.Map;

/**
 * @ClassName WebServiceServiceImpl
 * @Description TODO
 * @Date 2019/7/25 19:37
 * @Author fankai
 * @Version 1.0
 **/
@Service
@WebService(serviceName = "WebServiceService", // 与接口中指定的name一致
        targetNamespace = "http://webservice.demo.java.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.java.demo.webservice.WebServiceService" // 接口地址
)
public class WebServiceServiceImpl implements WebServiceService {

    @Autowired
    private TbCameraMapper tbCameraMapper;


    @Override
    public String getArea(String map) {
        List<Map<String,String>> list = tbCameraMapper.getAreaList();
        return JSONObject.toJSONString(list,new PascalNameFilter());
    }

    @Override
    public String getDvr(String map) {
        List<Map<String,String>> list = tbCameraMapper.getDvrList();
        return JSONObject.toJSONString(list,new PascalNameFilter());
    }

    @Override
    public String getCamera(String map) {
        List<Map<String,String>> list = tbCameraMapper.getCameraList();
        return JSONObject.toJSONString(list,new PascalNameFilter());
    }

    @Override
    public String getPreset(String map) {
        List<Map<String,String>> list = tbCameraMapper.getPresetList();
        return JSONObject.toJSONString(list,new PascalNameFilter());
    }
}
