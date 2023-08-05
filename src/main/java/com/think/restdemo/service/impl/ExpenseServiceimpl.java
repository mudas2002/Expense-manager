package com.think.restdemo.service.impl;

import com.think.restdemo.model.Expense;
import com.think.restdemo.repository.ExpenseRepository;
import com.think.restdemo.service.ExpenseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceimpl implements ExpenseService {

    ExpenseRepository expenseRepository;

    public ExpenseServiceimpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public void createUserExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    @Override
    public void updateUserExpense(Expense expense) {
        //business logic can be added here
        expenseRepository.save(expense);
    }

    @Override
    public void deleteUserExpense(Long expenseId) {
        expenseRepository.deleteById(expenseId);
    }

    @Override
    public Expense getUserExpense(Long expenseId) {
        return expenseRepository.findById(expenseId).get();
    }

    @Override
    public List<Expense> getAllUserExpense() {
        return expenseRepository.findAll();
    }
}
