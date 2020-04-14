package com.gs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.gs",exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.gs.**.mapper")
public class GsApplication {

    //启动入口 唯一
    public static void main(String[] args) {
        System.out.println("sg开始启动");
        SpringApplication.run(GsApplication.class, args);
    }

}
