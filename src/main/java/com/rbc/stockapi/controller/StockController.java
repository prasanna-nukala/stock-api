package com.rbc.stockapi.controller;

import com.rbc.stockapi.model.StockModel;
import com.rbc.stockapi.repository.StockRepository;
import com.rbc.stockapi.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RestController
@RequestMapping("/api")
public class StockController {

	@Autowired
	StockRepository stockRepository;
	
	@Autowired
	StockService stockService;

	@GetMapping("/dummy")
	public StockModel stockModel() {
		return new StockModel();
	}
	
	@PostMapping("/file-upload")
	public String uploadAllStocks(@RequestParam("file") MultipartFile file) {
		return stockService.uploadAllStocks(file);
	}
	
	@PostMapping("/stock")
	public String createStock(@RequestBody StockModel stock) {
		return stockService.createStock(stock);
	}
	
	
	@GetMapping("/stock/{symbol}")
	public List<StockModel> getAllStocks(@PathVariable(name = "symbol") String symbol) {
		return stockService.getAllStocks(symbol);
	}
	
}
