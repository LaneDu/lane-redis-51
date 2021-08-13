package com.galaxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.galaxy.rcache.dao")
@EnableCaching
@SpringBootApplication
public class RedisMybatisCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisMybatisCacheApplication.class, args);
    }

}
