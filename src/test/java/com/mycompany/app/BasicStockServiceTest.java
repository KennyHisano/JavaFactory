package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.Mockito;
import static org.mockito.Mockito.when;


public class BasicStockServiceTest {

    BasicStockService basicStockService = new BasicStockService();


    @Test
    public void BasicSSTestSymbol(){

        //check return type
        assertTrue(basicStockService.getQuote("aa") instanceof StockQuote);
    }

    @Test
    public void BasicSSTestInput(){
        //check two inputs.
        //one to expect return "Googl" for any string input
        // another to expect even if the input is null
        String symbol = "Apppl";
        String nullString = null;
        BasicStockService basicStockService = new BasicStockService();


        //check return type

        assertTrue(basicStockService.getQuote("aa") instanceof StockQuote);

        StockQuote appleSymbol = basicStockService.getQuote(symbol);
        StockQuote nullSymbol = basicStockService.getQuote(nullString);

        assertNotEquals(appleSymbol.getSymbol(),symbol);
        assertEquals(appleSymbol.getSymbol(),"Googl");

        assertNotEquals(nullSymbol.getSymbol(),nullString);
        assertEquals(nullSymbol.getSymbol(),"Googl");

    }
}