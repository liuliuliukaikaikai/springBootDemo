package org.hdxy;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("org.hdxy.mapper")
//@MapperScan("org.hdxy.dao")
public class Demo8Application {
    public static void main(String[] args) {

        SpringApplication.run(Demo8Application.class, args);
    }

}
