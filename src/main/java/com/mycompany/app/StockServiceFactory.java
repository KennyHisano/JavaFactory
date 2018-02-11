package com.mycompany.app;

public class StockServiceFactory {

    private StockService stockService;

//    /**
//     *Create new <CODE>StockServiceFactory<CODE/> instance
//     * @param stockService is used to fetch actual data
//     */
//    public StockServiceFactory(StockService stockService){
//        this.stockService = stockService;
//    }


    public static StockService getInstance() {
        return new BasicStockService();
    }

}

