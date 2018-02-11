package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class StockQuoteTest {

    @Test
    public void getQuoteTest(){
        String Symbol = "Googl";
        StockQuote testQuote = new StockQuote(Symbol);

        //check return type
        assertTrue(testQuote.getSymbol() instanceof String);

        //check method weather it matches with input value or not
        assertEquals(testQuote.getSymbol(),Symbol);
    }

}