package com.example.libreria.Entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_loans")
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long LoanId;
    private String name_loan;
    private String name_book;
    private String date_loan;
    private String date_dev;
    private String price_book;
    private int cant;

    public Loans() {
        this.LoanId = LoanId;
        this.date_dev = date_dev;
        this.cant = cant;
        this.name_book = name_book;
        this.name_loan = name_loan;
        this.price_book = price_book;
        this.date_loan = date_loan;
    }

    public int getCant() {
        return cant;
    }

    public String getDate_dev() {
        return date_dev;
    }

    public String getDate_loan() {
        return date_loan;
    }

    public Long getLoanId() {
        return LoanId;
    }

    public String getName_book() {
        return name_book;
    }

    public String getName_loan() {
        return name_loan;
    }

    public String getPrice_book() {
        return price_book;
    }

    public void setPrice_book(String price_book) {
        this.price_book = price_book;
    }

    public void setName_loan(String name_loan) {
        this.name_loan = name_loan;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public void setLoanId(Long loanId) {
        LoanId = loanId;
    }

    public void setDate_loan(String date_loan) {
        this.date_loan = date_loan;
    }

    public void setDate_dev(String date_dev) {
        this.date_dev = date_dev;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}
