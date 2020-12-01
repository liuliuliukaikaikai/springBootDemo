package org.hdxy.controller;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 自定义监听器
 */
@Component
public class CustomListenerThree {
    @EventListener
    public void eventListener(CustomEvent event) {
        event.printMessage("第三个");
    }


}
