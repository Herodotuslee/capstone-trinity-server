package com.capstone.demo.controllers;

import com.capstone.demo.domain.Expense;
import com.capstone.demo.domain.Project;
import com.capstone.demo.services.ExpenseService;
import com.capstone.demo.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;



@RestController
@RequestMapping("/api/expense")
@CrossOrigin
public class ExpenseController {


    @Autowired
    private ExpenseService expenseService;



    @GetMapping("/all")
    public Iterable<Expense> getAllExpenses(){
        return expenseService.findAllExpenses();}


    @PostMapping("")
    public ResponseEntity<?> createNewExpnse(@Valid @RequestBody Expense expense){
        Expense expense1 = expenseService.updateExpense(expense);
        return new ResponseEntity<Expense>(expense1, HttpStatus.CREATED);
    }

    @DeleteMapping("/{expenseId}")
    public ResponseEntity<?> deleteExpense(@PathVariable Long expenseId){
       expenseService.deleteExpense(expenseId);
        return new ResponseEntity<String>("Project with ID: '"+expenseId+"' was deleted", HttpStatus.OK);
    }
    
}
