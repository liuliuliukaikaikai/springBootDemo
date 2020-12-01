package org.hdxy;

import org.hdxy.controller.CustomListenerOne;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 事件监听
 */
@SpringBootApplication
public class Springbootdemo9Application {

    public static void main(String[] args) {
     ConfigurableApplicationContext context =  SpringApplication.run(Springbootdemo9Application.class, args);
     //加载事件监听
     context.addApplicationListener(new CustomListenerOne());
    }

}
