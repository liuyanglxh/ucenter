package com.liuyang.ucenter;

import com.liuyang.common.boot.ApiMonitorFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.liuyang")
@ComponentScan("com.liuyang")
public class UcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UcenterApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean registrationBean1() {
        FilterRegistrationBean first = new FilterRegistrationBean(new ApiMonitorFilter());
        first.addUrlPatterns("/*");
        first.setOrder(1);
        return first;
    }


}
