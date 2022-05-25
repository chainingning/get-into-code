package com.chaining.patterns.structural.bridge.ex1.mode;


public class PayFaceMode implements IPayMode{
    public boolean security(String uId) {
        System.out.println("人脸支付，风控校验脸部识别");
        return true;
    }

}