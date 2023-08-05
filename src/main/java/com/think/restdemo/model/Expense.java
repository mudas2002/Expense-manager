package com.think.restdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name="user_expenses_info")
public class Expense {
    @Id
    private Long id;
    private String name;
    private Instant dateTime;
    private String cat_name;//incoming or outgoing
    private String specify;//bill, profit, salary, food or sales
    private double amount;

    public Expense() {
    }

    public Expense(Long id, String name, Instant dateTime, String cat_name, String specify, double amount) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.cat_name = cat_name;
        this.specify = specify;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getSpecify() {
        return specify;
    }

    public void setSpecify(String specify) {
        this.specify = specify;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
