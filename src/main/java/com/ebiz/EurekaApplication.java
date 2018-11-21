package com.ebiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @description Eureka 服务端注册中心
 * @version 1.0
 * @author tangzj
 * @update 2017年8月25日 上午9:06:34
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    /**
     * @description 启动服务
     * @param args
     * @version 1.0
     * @author tangzj
     * @update 2017年8月25日 上午10:05:37
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}