package com.example.libreria.Service;

import com.example.libreria.Entity.Users;
import com.example.libreria.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    UsersRepository usersrepository;

    public List<Users> getUsers(){
        return usersrepository.findAll();
    }
    public Optional<Users> getUser(Long id){
        return usersrepository.findById(id);
    }

    public void SaveOrUpdateUsers(Users users){
        usersrepository.save(users);
    }
    public void DeleteUsers(Long id){
        usersrepository.deleteById(id);
    }
}
