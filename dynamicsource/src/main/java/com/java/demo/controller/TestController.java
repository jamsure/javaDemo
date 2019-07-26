package com.java.demo.controller;

import com.java.demo.entity.TbCamera;
import com.java.demo.service.TbCameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Date 2019/4/3 15:02
 * @Author fankai
 * @Version 1.0
 **/
@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    private TbCameraService tbCameraService;

    @RequestMapping("/getTbCamera")
    public Object getTbCamera(String keyId){
        TbCamera tbCamera = new TbCamera(keyId);
        return tbCameraService.get(tbCamera);
    }


}
