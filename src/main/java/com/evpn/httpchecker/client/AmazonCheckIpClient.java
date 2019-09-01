package com.evpn.httpchecker.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class AmazonCheckIpClient {

    private static final Logger logger = LoggerFactory.getLogger(AmazonCheckIpClient.class);

    @Bean
    public RestTemplate restTemplate() {
        logger.info("Constructed bean for RestTemplate");
        return new RestTemplate();
    }

    @Value("${AmazonCheckIp.url}")
    private String checkIpUrl;

    @Autowired
    private RestTemplate restTemplate;

    public AmazonCheckIpClient() {
        logger.info("AmazonCheckIpClient constructed");
    }

    public String checkMyIp() {
        logger.info("Using url : {}", checkIpUrl);
        ResponseEntity<String> response;
        response = restTemplate.getForEntity(checkIpUrl, String.class);
        logger.info("My ip : {}", response.getBody());
        return response.getBody();
    }
}