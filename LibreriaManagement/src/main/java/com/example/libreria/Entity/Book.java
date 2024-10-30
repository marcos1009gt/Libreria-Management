package com.example.libreria.Entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long BookId;
    private String name;
    private String author;
    private int precio;
    private int cant;

    public Book(){
        this.BookId = BookId;
        this.name = name;
        this.author = author;
        this.precio = precio;
        this.cant = cant;
    }

    public Long getBookId(){ return BookId; }
    public void setBookId(){ this.BookId = BookId; }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public String getAuthor(){ return author; }
    public void setAuthor(String author){ this.author = author; }

    public int getPrecio(){ return precio; }
    public void setPrecio(int precio){ this.precio = precio; }

    public int getCant(){ return cant; }
    public void setCant(int cant){ this.cant = cant; }
}
