package com.example.readquote;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReadQuoteIntegrationTest {
    @Test
    public void shouldConnectToRandomQuoteGenerator() throws IOException {
        URL url = new URL("https://quoters.apps.pcfone.io/api/random");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        assertEquals(connection.getResponseCode(),200);
    }

    @Test
    public void shouldGetQuoteFromURL_and_CreateQuoteObject(){
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject(
                "https://quoters.apps.pcfone.io/api/random", Quote.class);
        assertTrue(quote instanceof Quote);
        assertTrue(quote.getValue() instanceof Value);
        assertTrue(quote.getValue().getQuote().length() > 0);
    }

}