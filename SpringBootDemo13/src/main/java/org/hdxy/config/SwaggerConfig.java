package org.hdxy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 声明配置文件类
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)//声明文件类型
                .select()//选择器 设置 apis和 paths
                .apis(RequestHandlerSelectors.any())//apis设置哪些controller的接口（全部）
                .paths(PathSelectors.any())//paths在查找处理的接口中进行筛选（全部）
                .build()//创建
                .apiInfo(this.apiInfo());

    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("springdemo13")
                .description("描述信息设置")
                .version("设置版本信息")
                .build();
    }
}
