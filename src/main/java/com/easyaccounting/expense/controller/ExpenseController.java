package com.easyaccounting.expense.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easyaccounting.expense.model.ExpItemTbl;
import com.easyaccounting.expense.repository.ExpenseCategoryRepository;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {
	
	@Autowired
	private ExpenseCategoryRepository expenseCategoryRepository;
	
	
	@GetMapping("/")
	public List<ExpItemTbl> getAllExpenseTypes() {
	    return expenseCategoryRepository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<ExpItemTbl> getExpenseTypeById(@PathVariable int id) {
	    Optional<ExpItemTbl> exp = expenseCategoryRepository.findById(id);
	    return exp.map(response -> ResponseEntity.ok().body(response))
	    		.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
}

