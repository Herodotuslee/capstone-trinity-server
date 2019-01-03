package com.capstone.demo.repositories;

import com.capstone.demo.domain.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense,Long> {
}
