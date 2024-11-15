package com.example.receipe_sharing.Controller;

import com.example.receipe_sharing.Model.AccountUser;
import com.example.receipe_sharing.Repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserRepository userRepository;
    @PostMapping("/user")
    public AccountUser createUser(@RequestBody AccountUser accountUser){
     AccountUser saveduser=userRepository.save(accountUser);
     return saveduser;
    }
}
