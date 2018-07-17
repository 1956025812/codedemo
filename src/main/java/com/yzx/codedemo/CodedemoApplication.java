package com.yzx.codedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.yzx.codedemo.mapper")
@EnableSwagger2
public class CodedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodedemoApplication.class, args);
        System.out.println("codedemo has started successfully.......");
    }

}
