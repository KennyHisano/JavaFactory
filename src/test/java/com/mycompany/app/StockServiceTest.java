package com.mycompany.app;

import org.junit.Test;
<<<<<<< HEAD
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
=======
import org.mockito.Mockito;

import static org.junit.Assert.*;

import static org.mockito.Mockito.when;

>>>>>>> 9c942c52743cc713116c9753243748602addee1e

public class StockServiceTest {

    @Test
    public void testServiceInterface(){
        //check weather it's interface
        assertTrue(StockService.class .isInterface());
    }

<<<<<<< HEAD

    StockService stockService = StockServiceFactory.getInstance();
    @Test
    public void testQuoteSymbol(){

        //check the usage of factory method.
=======
    @Test
    public void testCall(){
        //check the usage of factory method.

        StockService stockService = Mockito.mock(StockServiceFactory.getInstance().getClass());
        stockService = StockServiceFactory.getInstance();

>>>>>>> 9c942c52743cc713116c9753243748602addee1e
        //check implements
        assertTrue(stockService instanceof BasicStockService);
        //check method's type
        assertTrue(stockService.getQuote(null) instanceof StockQuote);


<<<<<<< HEAD
=======

>>>>>>> 9c942c52743cc713116c9753243748602addee1e
        // checking return value moved to BasicStockServiceTest
        //StockQuote quote = stockService.getQuote("aaa");
        //assertEquals(quote.getSymbol(),"Googl");

<<<<<<< HEAD
    }

    @Test
    public void testList(){
        String symbol = "a";
        Calendar from = new GregorianCalendar(2013,01,01);
        Calendar until = new GregorianCalendar(2018,01,01);
        assertTrue(stockService.getQuote(symbol,from,until) instanceof List);

    }

=======


    }
>>>>>>> 9c942c52743cc713116c9753243748602addee1e
}