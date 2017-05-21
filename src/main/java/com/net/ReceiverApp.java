package com.net;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 从Message Queue中读取消息
 */
public class ReceiverApp {

    public static void main(String[] args) {

        new ClassPathXmlApplicationContext("JMSConfiguration.xml", "JMSReceiver.xml");
    }

}
