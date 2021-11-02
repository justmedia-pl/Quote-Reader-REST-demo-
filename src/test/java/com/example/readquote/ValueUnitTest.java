package com.example.readquote;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ValueUnitTest {
    @Test
    public void shouldCreateValue(){
        Long randomLong = new Random().nextLong();
        Value value = new Value();
        value.setId(randomLong);
        value.setQuote("Test quote");

        assertTrue(value instanceof Value);
        assertEquals(value.getId(),randomLong);
        assertEquals(value.getQuote(),"Test quote");
    }
}