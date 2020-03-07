package com.fabioqmarsiaj.isoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class IsoserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IsoserviceApplication.class, args);
    }

}
