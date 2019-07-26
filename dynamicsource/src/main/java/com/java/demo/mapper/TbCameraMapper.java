package com.java.demo.mapper;

import com.java.demo.entity.TbCamera;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TbCameraMapper
 * @Description TODO
 * @Date 2019/6/3 16:16
 * @Author fankai
 * @Version 1.0
 **/
public interface TbCameraMapper {
    TbCamera get(TbCamera tbCamera);

    List<TbCamera> getList(TbCamera tbCamera);

    List<Map<String,String>> getAreaList();

    List<Map<String,String>> getDvrList();

    List<Map<String,String>> getCameraList();

    List<Map<String,String>> getPresetList();
}
