
package com.mycompany.app;


public interface StockService {
    /**
     * expected usage:
     * StockService StockService = StockServiceFactory.getInstance();
     */
    /**
     * Return the current price for a share of stock for the given symbol
     * @param symbol the stock symbol of the company you want a quote for.
     * e.g. APPL for APPLE
     * @return a <CODE>StockQuote </CODE> instance
     */
    StockQuote getQuote(String symbol);
}