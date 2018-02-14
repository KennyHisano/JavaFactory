package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;


public class StockServiceFactoryTest {

    @Test
    public void testStockService(){

        //check implements
        assertTrue(StockServiceFactory.getInstance() instanceof BasicStockService);


    }
}

