package com.example.readquote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ReadQuoteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReadQuoteApplication.class, args);
    }
    @Bean
    public static String getQuote() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject(
                    "https://quoters.apps.pcfone.io/api/random", Quote.class);
           return quote.getValue().getQuote();
        };
}