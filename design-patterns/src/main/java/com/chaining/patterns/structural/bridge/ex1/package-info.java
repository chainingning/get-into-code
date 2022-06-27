/**
 * 我们这个案例就模拟一个这样的第三方平台来承接各个支付能力，同时使用自家的人脸让用户支付起来更加容易。
 * 那么这里就出现了多支付与多模式的融合使用，如果给每一个支付都实现一次不同的模式，即使是继承类也需要开发好多。
 * 而且随着后面接入了更多的支付服务或者支付方式，就会呈爆炸似的扩展。
 */
package com.chaining.patterns.structural.bridge.ex1;