package com.mycompany.app;

public class StockQuote {

    private String stockSymbol;

    /**
     *  Create a new  StockData instance
     * @param stockSymbol the stock symbol e.g. APPL (for APPLE)
     */
    public StockQuote(String stockSymbol) {

        this.stockSymbol = stockSymbol;
    }

    public String getSymbol(){
        return stockSymbol;
    }

}
