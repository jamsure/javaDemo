package com.java.demo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @ClassName WebServiceService
 * @Description TODO
 * @Date 2019/7/25 19:35
 * @Author fankai
 * @Version 1.0
 **/
@WebService
public interface WebServiceService {

    //区域表，DVR表，摄像机表，预制位表

    @WebMethod
    String getArea(String map);

    @WebMethod
    String getDvr(String map);

    @WebMethod
    String getCamera(String map);

    @WebMethod
    String getPreset(String map);




}
