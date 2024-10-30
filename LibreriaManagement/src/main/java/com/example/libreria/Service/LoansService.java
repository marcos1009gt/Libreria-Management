package com.example.libreria.Service;

import com.example.libreria.Entity.Loans;
import com.example.libreria.Repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoansService {
    @Autowired
    LoansRepository loansRepository;

    public List<Loans> getLoans(){
        return loansRepository.findAll();
    }
    public Optional<Loans> getLoan(Long id){
        return loansRepository.findById(id);
    }

    public void SaveOrUpdateLoans(Loans loans){
        loansRepository.save(loans);
    }
    public void DeleteLoans(Long id){
        loansRepository.deleteById(id);
    }
}
