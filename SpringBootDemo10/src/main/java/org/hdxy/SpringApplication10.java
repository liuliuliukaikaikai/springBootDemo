package org.hdxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 拦截器 过滤器
 */
@SpringBootApplication
@ServletComponentScan
public class SpringApplication10 {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplication10.class, args);
    }

}
