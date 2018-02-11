package com.mycompany.app;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import static org.mockito.Mockito.when;


public class StockServiceTest {

    @Test
    public void testServiceInterface(){
        //check weather it's interface
        assertTrue(StockService.class .isInterface());
    }

    @Test
    public void testCall(){
        //check the usage of factory method.

        StockService stockService = Mockito.mock(StockServiceFactory.getInstance().getClass());
        stockService = StockServiceFactory.getInstance();

        //check implements
        assertTrue(stockService instanceof BasicStockService);
        //check method's type
        assertTrue(stockService.getQuote(null) instanceof StockQuote);



        // checking return value moved to BasicStockServiceTest
        //StockQuote quote = stockService.getQuote("aaa");
        //assertEquals(quote.getSymbol(),"Googl");



    }
}