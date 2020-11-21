package org.hdxy;

import org.hdxy.config.FootConfig;
import org.hdxy.config.VegetablesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * SpringBoot的配置
 */
@EnableConfigurationProperties({FootConfig.class, VegetablesConfig.class})
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
