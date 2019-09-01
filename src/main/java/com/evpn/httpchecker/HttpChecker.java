package com.evpn.httpchecker;

import com.evpn.httpchecker.client.AmazonCheckIpClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HttpChecker {

    private static final Logger logger = LoggerFactory.getLogger(HttpChecker.class);

    @Autowired
    AmazonCheckIpClient amazonCheckIpClient;

    public static void main(String[] args) {
        logger.info("HttpChecker mainHttpChecker");
        SpringApplication.run(HttpChecker.class, args);
    }
}