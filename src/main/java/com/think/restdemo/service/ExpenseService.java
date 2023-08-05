package com.think.restdemo.service;

import com.think.restdemo.model.Expense;

import java.util.List;

public interface ExpenseService {
    public void createUserExpense(Expense expense);
    public void updateUserExpense(Expense expense);
    public void deleteUserExpense(Long expenseId);
    public Expense getUserExpense(Long expenseId);

    public List<Expense> getAllUserExpense();
}
