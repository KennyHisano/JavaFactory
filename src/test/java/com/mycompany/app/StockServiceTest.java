package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class StockServiceTest {

    @Test
    public void testServiceInterface(){
        //check weather it's interface
        assertTrue(StockService.class .isInterface());
    }


    StockService stockService = StockServiceFactory.getInstance();
    @Test
    public void testQuoteSymbol(){

        //check the usage of factory method.
        //check implements
        assertTrue(stockService instanceof BasicStockService);
        //check method's type
        assertTrue(stockService.getQuote(null) instanceof StockQuote);


        // checking return value moved to BasicStockServiceTest
        //StockQuote quote = stockService.getQuote("aaa");
        //assertEquals(quote.getSymbol(),"Googl");

    }

    @Test
    public void testList(){
        String symbol = "a";
        Calendar from = new GregorianCalendar(2013,01,01);
        Calendar until = new GregorianCalendar(2018,01,01);
        assertTrue(stockService.getQuote(symbol,from,until) instanceof List);

    }

}