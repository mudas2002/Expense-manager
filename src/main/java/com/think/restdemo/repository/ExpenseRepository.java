package com.think.restdemo.repository;

import com.think.restdemo.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository <Expense, Long>{

}
