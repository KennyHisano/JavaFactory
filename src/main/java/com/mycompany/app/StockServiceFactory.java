package com.mycompany.app;

public class StockServiceFactory {

    private StockService stockService;

//    /**
//     *Create new <CODE>StockServiceFactory<CODE/> instance
//     * @param stockService is used to fetch actual data
//     */
<<<<<<< HEAD
=======
//    public StockServiceFactory(StockService stockService){
//        this.stockService = stockService;
//    }


>>>>>>> 9c942c52743cc713116c9753243748602addee1e
    public static StockService getInstance() {
        return new BasicStockService();
    }

<<<<<<< HEAD
    
=======
>>>>>>> 9c942c52743cc713116c9753243748602addee1e
}

