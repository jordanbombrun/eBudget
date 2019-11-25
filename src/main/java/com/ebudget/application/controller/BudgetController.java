package com.ebudget.application.controller;

import com.ebudget.application.Repository.BudgetRepository;
import com.ebudget.application.model.Budget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/budget")
public class BudgetController {

    @Autowired
    BudgetRepository budgetRepository;

    @PostMapping(value = "")
    @ResponseBody
    public Budget postBudget(@RequestBody Budget budget) {
        return budgetRepository.save(budget);
    }

    @GetMapping(value = "/all")
    @ResponseBody
    public String getAllBudgets() {
        Iterable<Budget> list = budgetRepository.findAll();
        String returnString = "";
        for (Budget budget : list) {
            returnString += budget.toString() + ", ";
        }
        return returnString;
    }


}
