package com.capstone.demo.services;


import com.capstone.demo.domain.Expense;
import com.capstone.demo.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;


    public Expense updateExpense(Expense expense){
        return expenseRepository.save(expense);

    }

    public void deleteExpense(Long expense_id){
      expenseRepository.deleteById(expense_id);
    }

    public Iterable<Expense> findAllExpenses(){
        return expenseRepository.findAll();
    }

}
