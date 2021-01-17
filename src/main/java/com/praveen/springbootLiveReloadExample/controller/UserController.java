package com.praveen.springbootLiveReloadExample.controller;

import com.praveen.springbootLiveReloadExample.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping("/all")
    public List<User> findAllUsers(){

        return Arrays.asList(new User("praveen",27,"praveen@gmail.com"),new User("andy",26,"andy@gmail.com"));

    }
    @GetMapping("/{name}")
    public User findUserByName(@PathVariable("name") String name){
        System.out.println("method is called");
        return new User(name,34,name+"gmail.com");
    }

}
