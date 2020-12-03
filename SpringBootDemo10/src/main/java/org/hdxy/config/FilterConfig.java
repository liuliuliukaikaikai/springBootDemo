package org.hdxy.config;

import org.hdxy.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
//    @Bean
//    public FilterRegistrationBean<CustomFilter> filterRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new CustomFilter());//添加过滤器
//        filterRegistrationBean.addUrlPatterns("/*");//过滤规则
////                filterRegistrationBean.setOrder(1); 设置优先级 越小优先级越高
//        return filterRegistrationBean;
//    }

}