package com.feng.pai;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class PaiApplication {

    public PaiApplication() {
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        System.out.println("sout");
    }

    public static void main(String[] args) {
        SpringApplication.run(PaiApplication.class, args);
    }

}
