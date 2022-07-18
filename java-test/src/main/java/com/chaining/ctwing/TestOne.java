package com.chaining.ctwing;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.ctg.ag.sdk.biz.AepDeviceCommandClient;
import com.ctg.ag.sdk.biz.AepDeviceManagementClient;
import com.ctg.ag.sdk.biz.AepDeviceStatusClient;
import com.ctg.ag.sdk.biz.aep_device_command.QueryCommandListRequest;
import com.ctg.ag.sdk.biz.aep_device_management.QueryDeviceListRequest;
import com.ctg.ag.sdk.biz.aep_device_status.GetDeviceStatusHisInPageRequest;
import com.ctg.ag.sdk.biz.aep_device_status.GetDeviceStatusHisInTotalRequest;
import com.ctg.ag.sdk.biz.aep_device_status.QueryDeviceStatusListRequest;
import com.ctg.ag.sdk.biz.aep_device_status.QueryDeviceStatusRequest;
import org.junit.Test;

import java.util.Arrays;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class TestOne {

    // 签名同步调用接口示例
    @Test
    public void testApiWithSignature() throws Exception {
        AepDeviceStatusClient client =
                AepDeviceStatusClient.newClient().appKey("fKXr0d1FIBi").appSecret("uv6Pey6BGa").build();
        {
            //other参数定义
            Device device = new Device(0, "", "");
            //公共参数定义
            CreateDeviceDto deviceDto =
                    new CreateDeviceDto("15268276","72236278f0674698b547920710a29676","dataVal1");
            QueryDeviceStatusRequest request = new QueryDeviceStatusRequest();
//            request.setParamMasterKey("d606182c5e4946faaf874b2ad74073ef");
//            request.setParamProductId("15268276");
//            request.setParamDeviceId("72236278f0674698b547920710a29676");
//            request.setParam("productId","15268276");
//            request.setParam("deviceId","72236278f0674698b547920710a29676");
            request.setBody(JSON.toJSONBytes(deviceDto));

            // request.setParam..  	// set your request params here
            System.out.println(new String(client.QueryDeviceStatus(request).getBody(), "utf-8"));
            JSONObject jsonObject = JSONObject.parseObject(new String(client.QueryDeviceStatus(request).getBody(),
                    "utf-8"));
            String value = jsonObject.get("deviceStatus").toString();
            System.out.println(StrUtils.parseArrayList(value));
        }

        client.shutdown();
    }


    @Test
    public void testAepDeviceManagementClient() throws Exception {
        AepDeviceManagementClient client = AepDeviceManagementClient.newClient().appKey("fKXr0d1FIBi").appSecret("uv6Pey6BGa").build();
        QueryDeviceListRequest request = new QueryDeviceListRequest();
        request.addParamProductId("15268276");
        request.setParamMasterKey("d606182c5e4946faaf874b2ad74073ef");
        // request.setParam..  	// set your request params here
        System.out.println(client.QueryDeviceList(request));
    }


}
