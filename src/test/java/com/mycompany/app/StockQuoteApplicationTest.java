package com.mycompany.app;

import org.junit.Test;


public class StockQuoteApplicationTest {

    @Test(expected = NullPointerException.class)
    public void testMainNegative(){
      StockQuoteApplication.main(null);
    }

}