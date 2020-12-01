package org.hdxy.controller;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    public  void printMessage(String msg){
        System.out.println("自定义监听器");
        System.out.println(msg);
    }
}
