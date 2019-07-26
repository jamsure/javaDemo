package com.java.demo.webservice;


import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

public class WSClient {
        public static void main(String[] args) {
//                callTrans();
            String callMethod = callMethod("getArea");
            String callMethod1 = callMethod("getDvr");
            String callMethod2 = callMethod("getCamera");
            String callMethod3 = callMethod("getPreset");
//            JSONObject obj = new JSONObject(callMethod);
            
        }
        
        public static String callMethod(String method){
            String resultStr ="";
            try {
                //new一个服务
                Service service = new Service();
                
                //创建一个call对象
                Call call = (Call) service.createCall();
                
                //设置要调用的webserivce网址
                call.setTargetEndpointAddress("http://localhost:8130/ws/webservice?wsdl");
                
                //设置要调用的接口方法   QName里的第一个参数为http://192.168.1.104:9001/WSSerivce/serivces/transcoding?wsdl网址里的namespace值,第二个参数为调用方法名
                call.setOperationName(new QName("http://webservice.demo.java.com/", method));
                
                //设置参数不使用服务端定义的参数名，而是arg0~argN来定义
                call.addParameter("arg0", XMLType.XSD_STRING, ParameterMode.IN);
//                call.addParameter("arg1", XMLType.XSD_STRING, ParameterMode.IN);
                
                
                //设置参数返回类型
                call.setReturnType(XMLType.XSD_STRING);
                
                String[] arg = {""}; 
                
                //发送转码请求
                resultStr = (String) call.invoke(arg);
                System.out.println("返回字符串"+resultStr);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            return resultStr;
        }
}

