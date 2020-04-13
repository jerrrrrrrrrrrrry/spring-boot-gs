package com.gs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.gs")
public class GsApplication {

    //启动入口 唯一
    public static void main(String[] args) {
        System.out.println("sg开始启动");
        SpringApplication.run(GsApplication.class, args);
    }

}
