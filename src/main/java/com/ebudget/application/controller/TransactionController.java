package com.ebudget.application.controller;

import com.ebudget.application.Repository.TransactionRepository;
import com.ebudget.application.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionRepository transactionRepository;

    @PostMapping(value = "")
    @ResponseBody
    public Transaction postTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @GetMapping(value = "/all")
    @ResponseBody
    public String getAllBudgets() {
        Iterable<Transaction> list = transactionRepository.findAll();
        String returnString = "";
        for (Transaction transaction : list) {
            returnString += transaction.toString() + ", ";
        }
        return returnString;
    }
}
