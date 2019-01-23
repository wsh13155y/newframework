package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("dao")
public class NewframeworkApplication {
    public static void main(String[] args){
        SpringApplication.run(NewframeworkApplication.class, args);
    }
}
