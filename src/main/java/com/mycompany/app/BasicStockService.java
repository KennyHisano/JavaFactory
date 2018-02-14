package com.mycompany.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



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

    /**
     *
     * @param symbol the stock symbol to search for
     * @param from the date of the first stock quote
     * @param until the date of the last stock quote
     * @return ArrayList containing the list of inputs.
     * Have to be the return type of StockQuote.
     *
     * <p>Note: With default Java's Calendar abstract class API, the count of month starts from ZERO.
     * so hard coded value returns added 1 month.
     * Inputs are Hard corded for outputs.
     *
     */
    public List<StockQuote> getQuote(String symbol, Calendar from, Calendar until){


        List<StockQuote> returnValue = new ArrayList<StockQuote>();

        //hard corded. It at least returns some type of data.
        Calendar HardFrom = Calendar.getInstance();
        HardFrom.set(2011,00,01);
        Calendar HardUntil = Calendar.getInstance();
        HardUntil.set(2014,00,01);

        //make sure from is before until
        if (from.before(until)) {
            StockQuote hardQuote = new StockQuote("Googl", HardFrom, HardUntil);
            returnValue.add(hardQuote);
        }
        //TODO
        //add error message when date is wrong.
        return returnValue;

    };
}
