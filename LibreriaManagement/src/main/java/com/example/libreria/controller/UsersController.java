package com.example.libreria.controller;

import com.example.libreria.Entity.Users;
import com.example.libreria.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<Users> getAll(){
        return usersService.getUsers();
    }

    @GetMapping("/{UserId}")
    public Optional<Users> getById(@PathVariable("UserId") Long userId){
        return usersService.getUser(userId);
    }

    @PostMapping
    public Users saveUpdate(@RequestBody Users users){
        usersService.SaveOrUpdateUsers(users);
        return users;
    }

    @DeleteMapping("/{UserId}")
    public void saveUpdate(@PathVariable("UserId") Long userId){
        usersService.DeleteUsers(userId);
    }
}
