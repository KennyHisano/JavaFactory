<<<<<<< HEAD
package com.mycompany.app;

import java.util.Calendar;
import java.util.List;
=======

package com.mycompany.app;
>>>>>>> 9c942c52743cc713116c9753243748602addee1e


public interface StockService {
    /**
<<<<<<< HEAD
     * Return the current price for a share of stock for the
     * given symbol
     * @param symbol the stock symbol of the company you want a
     * quote for e.g. APPL for APPLE
     * @return a <CODE>BigDecimal</CODE> instance
     */
    StockQuote getQuote(String symbol);
    /**
     * Get a historical list of stock quotes for the provided
     * symbol
     * @param symbol the stock symbol to search for
     * @param from the date of the first stock quote
     * @param until the date of the last stock quote
     * @return a list of StockQuote instances.
     * One for each day in the range specified.
     */
    List<StockQuote> getQuote(String symbol, Calendar from, Calendar until);
=======
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
>>>>>>> 9c942c52743cc713116c9753243748602addee1e
}