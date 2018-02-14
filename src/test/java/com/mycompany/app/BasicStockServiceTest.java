package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;


import java.util.Calendar;
import java.util.List;



public class BasicStockServiceTest {

    BasicStockService basicStockService = new BasicStockService();


    @Test
    public void BasicSSTestSymbol(){

        //check return type
        assertTrue(basicStockService.getQuote("aa") instanceof StockQuote);
    }

    @Test
    public void QuoteTestInput(){
        //check two inputs.
        //one to expect return "Googl" for any string input
        // another to expect even if the input is null
        String symbol = "Apppl";
        String nullString = null;


        StockQuote appleSymbol = basicStockService.getQuote(symbol);
        StockQuote nullSymbol = basicStockService.getQuote(nullString);

        assertNotEquals(appleSymbol.getSymbol(),symbol);
        assertEquals(appleSymbol.getSymbol(),"Googl");

        assertNotEquals(nullSymbol.getSymbol(),nullString);
        assertEquals(nullSymbol.getSymbol(),"Googl");

    }

    @Test
    public void ListTestInput(){

        Calendar calendarFrom = Calendar.getInstance();
        Calendar calendarUntil = Calendar.getInstance();
        calendarFrom.set(2001,00,01);
        calendarUntil.set(2002,00,01);

        List<StockQuote> stockQuoteList = basicStockService.getQuote("Appl",calendarFrom,calendarUntil);




        //Test return type and size of object.
        assertTrue(stockQuoteList instanceof List);
        assertTrue(stockQuoteList.size() == 1);


        //invert from and until and tesr the return value
        //make sure it returns empty for now
        stockQuoteList = basicStockService.getQuote("Appl",calendarUntil,calendarFrom);
        assertTrue(stockQuoteList.isEmpty());
    }

}

