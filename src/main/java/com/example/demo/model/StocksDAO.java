package com.example.demo.model;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class StocksDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
	@Transactional
	public void insert(String stockName , Integer price) {
		
		Stocks stocks = new Stocks();
		stocks.setStockName(stockName);
		stocks.setPrice(price);
		
		em.persist(stocks);
		
	}
	
	@Transactional(readOnly = true)
	public Stocks findStocksById(Integer id) {
		return em.find(Stocks.class, id);
	}

	

}


