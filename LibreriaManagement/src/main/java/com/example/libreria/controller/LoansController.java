package com.example.libreria.controller;

import com.example.libreria.Entity.Loans;
import com.example.libreria.Service.LoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/loans")
public class LoansController {
    @Autowired
    private LoansService loansService;

    @GetMapping
    public List<Loans> getAll(){
        return loansService.getLoans();
    }

    @GetMapping("/{LoanId}")
    public Optional<Loans> getById(@PathVariable("LoanId") Long loanId){
        return loansService.getLoan(loanId);
    }

    @PostMapping
    public Loans saveUpdate(@RequestBody Loans loans){
        loansService.SaveOrUpdateLoans(loans);
        return loans;
    }

    @DeleteMapping("/{LoanId}")
    public void saveUpdate(@PathVariable("LoanId") Long loanId){
        loansService.DeleteLoans(loanId);
    }
}
