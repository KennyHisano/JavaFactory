package com.mycompany.app;

public class BasicStockService implements StockService {

    private StockQuote stockQuote;

    public BasicStockService(){
    }
    /**
     *
     * @return stockquote instance
     */
    public StockQuote getQuote(String symbol) {
        return new StockQuote("Googl");
    }


}
