package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

<<<<<<< HEAD

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


=======
>>>>>>> 9c942c52743cc713116c9753243748602addee1e
public class StockQuoteTest {

    @Test
    public void getQuoteTest(){
        String Symbol = "Googl";
<<<<<<< HEAD
        StockQuote testQuote = new StockQuote(Symbol, Calendar.getInstance(),Calendar.getInstance());
=======
        StockQuote testQuote = new StockQuote(Symbol);
>>>>>>> 9c942c52743cc713116c9753243748602addee1e

        //check return type
        assertTrue(testQuote.getSymbol() instanceof String);

        //check method weather it matches with input value or not
        assertEquals(testQuote.getSymbol(),Symbol);
    }

<<<<<<< HEAD
    @Test
    public void formatTest(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2001,00,01);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.US);
        //Test DateFormat 00 == January.
        assertEquals(sdf.format(calendar.getTime()),"2001/01/01");

    }

=======
>>>>>>> 9c942c52743cc713116c9753243748602addee1e
}