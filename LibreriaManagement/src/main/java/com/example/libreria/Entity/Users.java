package com.example.libreria.Entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long UserId;
    private int cell;
    private String name;
    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    public Users() {
        this.UserId = UserId;
        this.email = email;
        this.cell = cell;
        this.name = name;
        this.password = password;
    }

    public Long getUserId() {
        return UserId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }
}
