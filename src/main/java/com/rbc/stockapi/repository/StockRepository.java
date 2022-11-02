package com.rbc.stockapi.repository;

import com.rbc.stockapi.model.StockModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface StockRepository extends MongoRepository<StockModel, String> {
	
	List<StockModel> findBySymbol(String symbol);
	
	
}

