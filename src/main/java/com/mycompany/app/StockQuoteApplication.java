package com.mycompany.app;




import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;


public class StockQuoteApplication {
    public static void main(String[] args) {


        if (args.length != 3){
            System.exit(-1);
        }


        /**
         * Convert input string <from> and <until> to Calendar format
         * set the input string for date to be GregorianCalendar
         * It will set the calendar index to default gregorian
         **/
        String symbol;
        Calendar from = GregorianCalendar.getInstance();
        Calendar until = GregorianCalendar.getInstance();

        //String symbol ="Googl";
        //GregorianCalendar returns configured date for Gregorian.
        //Calendar from = GregorianCalendar.getInstance();
        //from.set(2000,01,01);
        //Calendar until = GregorianCalendar.getInstance();
        //until.set(2018,01,01);



        //set the input string for date to be GregorianCalendar
        symbol = args[0];
        from.setTime(StockQuote.StrToDate(args[1]));
        until.setTime(StockQuote.StrToDate(args[2]));


        //Usage of interface StockService
        StockService stockService = StockServiceFactory.getInstance();
        List<StockQuote> results = stockService.getQuote(symbol,from,until);
        results = stockService.getQuote(symbol,from,until);

        System.out.println("stockQuote");
        // print out lists
        for (StockQuote stockQuote: results) {
            System.out.println(stockQuote.getSymbol() + " from the day of " + stockQuote.getFrom() + " to " + stockQuote.getUntil());
        }


    }
}
