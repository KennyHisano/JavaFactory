package com.mycompany.app;

<<<<<<< HEAD

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;

public class StockQuote {

    private String stockSymbol;
    private Calendar from;
    private Calendar until;

    /**
     * <CODE>SimpleDateFormat<CODE/> sets default format for outputs date.
     * The default index of month set to 0. Hence 1 for MM returns February.
     */
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd",Locale.US);

=======
public class StockQuote {

    private String stockSymbol;
>>>>>>> 9c942c52743cc713116c9753243748602addee1e

    /**
     *  Create a new  StockData instance
     * @param stockSymbol the stock symbol e.g. APPL (for APPLE)
     */
    public StockQuote(String stockSymbol) {
<<<<<<< HEAD
        this.stockSymbol = stockSymbol;
    }

    /**
     *  Create a new  StockData instance
     * @param stockSymbol the stock symbol e.g. APPL (for APPLE)
     * @param from the date of the stock started
     * @param until the end day of the stock available
     */
    public StockQuote(String stockSymbol, Calendar from,Calendar until){
        this.stockSymbol = stockSymbol;
        this.from = from;
        this.until = until;
    }

    /**
     *
     * @return <CODE>stockSymbol<CODE/> String value
     */
=======

        this.stockSymbol = stockSymbol;
    }

>>>>>>> 9c942c52743cc713116c9753243748602addee1e
    public String getSymbol(){
        return stockSymbol;
    }

<<<<<<< HEAD
    /**
     *
     * @return <CODE>sdf.format(from.getTime())<CODE/> Calendar value 'from' formatted to String
     */
    public String getFrom() {
        return DateToStr(from.getTime());
    }

    /**
     *
     * @return <CODE>sdf.format(until.getTime())<CODE/> Calendar value 'until' formatted to String
     */
    public String getUntil(){
        return DateToStr(until.getTime());
       // sdf.format(until.getTime());
    }

    //convert Date input to String
    public static String DateToStr(Date date){
        return sdf.format(date);
    }

    //convert String input to Date
    public static Date StrToDate(String string) {
        Date date = null;
        try {
            date = sdf.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
=======
>>>>>>> 9c942c52743cc713116c9753243748602addee1e
}
