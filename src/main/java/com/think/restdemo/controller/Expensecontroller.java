package com.think.restdemo.controller;

import com.think.restdemo.model.Expense;
import com.think.restdemo.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense")
public class Expensecontroller
{
    //Expense expense;
    ExpenseService expenseService;

    public Expensecontroller(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    //for SPECIFIC users expense details
    @GetMapping("{id}")
    public Expense getUserExpenseDetails(@PathVariable("id") Long id)
    {
        return expenseService.getUserExpense(id);

    }

    //for ALL users expense details
    @GetMapping()
    public List<Expense> getAllUserExpenseDetails()
    {
        return expenseService.getAllUserExpense();
    }

    @PostMapping
    public String createUserExpenseDetails(@RequestBody Expense expense)
    {
        expenseService.createUserExpense(expense);
        return "Expense created successfully";
    }

    @PutMapping
    public String updateUserExpenseDetails(@RequestBody Expense expense)
    {
        expenseService.updateUserExpense(expense);
        return "Expense UPDATED successfully";
    }
    @DeleteMapping("{id}")
    public String deleteUserExpenseDetails(@PathVariable("id") Long id)
    {
        expenseService.deleteUserExpense(id);
        return "Expense DELETED successfully";
    }
}
