package com.example.readquote;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest
class QuoteUnitTest {
    @Test
    public void shouldCreateQuote() {
        Quote quote = new Quote();
        Value value = Mockito.mock(Value.class);
        quote.setType("type");
        quote.setValue(value);

        assertTrue(quote instanceof Quote);
        assertEquals(quote.getType(),"type");

    }

}