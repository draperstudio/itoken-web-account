package com.draper.itoken.web.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author draper_hxy
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.draper.itoken.web.account.dao")
public class WebAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAccountApplication.class, args);
    }

}
