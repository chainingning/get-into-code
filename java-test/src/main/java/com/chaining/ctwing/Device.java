package com.chaining.ctwing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {
    /*
    "other": {"autoObserver":0,
            "imsi":"12545154878451",
            "pskValue":"ADvNWlkcNq9AfKnk"},
     */
    private Integer autoObserver; //0.自动订阅 1.取消自动订阅，必填
    private String imsi; //选填
    private String pskValue; //选填
}
