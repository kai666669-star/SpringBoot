package com.example.demo.action;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Stocks;
import com.example.demo.model.StocksDAO;


@Component
public class Ex4TestHibernateStocks implements CommandLineRunner{
	
	private StocksDAO stocksDAO;


	public Ex4TestHibernateStocks(StocksDAO stocksDAO) {
		this.stocksDAO = stocksDAO;
	}


	@Override
	public void run(String... args) throws Exception {
		
		//新增測試
		stocksDAO.insert("聯發科", 4000);
		
		//測試透過id讀取
		Stocks result = stocksDAO.findStocksById(2);
		
		if(result != null) {
			System.out.println("name:" + result.getStockName() +"  "+ "price:" + result.getPrice());
		}else {
			System.out.println("沒有這筆資料");
		}
	}

	
	
}
