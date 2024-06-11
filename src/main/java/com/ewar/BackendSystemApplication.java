package com.ewar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ewar.*.mapper")
public class BackendSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendSystemApplication.class, args);
    }

}
