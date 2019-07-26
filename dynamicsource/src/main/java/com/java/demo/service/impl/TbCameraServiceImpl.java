package com.java.demo.service.impl;


import com.java.demo.entity.TbCamera;
import com.java.demo.mapper.TbCameraMapper;
import com.java.demo.service.TbCameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName TbCameraServiceImpl
 * @Description TODO
 * @Date 2019/6/3 16:19
 * @Author fankai
 * @Version 1.0
 **/
@Component
public class TbCameraServiceImpl implements TbCameraService {
    @Autowired
    private TbCameraMapper tbCameraMapper;


    @Override
    public TbCamera get(TbCamera tbCamera) {
        return tbCameraMapper.get(tbCamera);
    }

    @Override
    public List<TbCamera> getList(TbCamera tbCamera) {
        return tbCameraMapper.getList(tbCamera);
    }
}
