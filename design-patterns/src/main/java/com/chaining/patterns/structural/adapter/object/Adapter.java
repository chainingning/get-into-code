package com.chaining.patterns.structural.adapter.object;

class Adapter implements Target{
    // 直接关联被适配类  
    private Adaptee adaptee;  
    
    // 可以通过构造函数传入具体需要适配的被适配类对象  
    public Adapter (Adaptee adaptee) {  
        this.adaptee = adaptee;  
    }  
    
    @Override
    public void Request() {  
        // 这里是使用委托的方式完成特殊功能  
        this.adaptee.SpecificRequest();  
    }

    public static void main(String[] args){
        //需要先创建一个被适配类的对象作为参数
        Target mAdapter = new Adapter(new Adaptee());
        mAdapter.Request();

    }
} 