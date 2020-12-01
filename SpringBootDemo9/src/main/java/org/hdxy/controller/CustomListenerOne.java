package org.hdxy.controller;

import org.springframework.context.ApplicationListener;

/**
 * 自定义监听器
 */
public class CustomListenerOne implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("监听到了");
    }
}
