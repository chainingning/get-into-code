package com.chaining.ctwing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateDeviceDto {
    /*
        创建设备的dto
     */
    private String productId; //产品ID，必填
    private String deviceId; //设备编号，MQTT,T_Link,TCP,HTTP,JT/T808，南向云协议必填
//    private String deviceName; //设备名称，必填
//    private String imei; //imei号，LWM2M,NB网关协议必填
//    private String operator; //操作者，必填
//    private Device device; //LWM2M协议必填参数
    private String datasetId;

}
