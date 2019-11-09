package com.sm43.SpringJPAPostgreSQL.controller;

import com.sm43.SpringJPAPostgreSQL.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class ApplicationController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String allUsers() {
        return userService.getUsers();
    }

    @GetMapping("/add/{name}/{city}")
    public String addUser(@PathVariable String name, @PathVariable String city) {
        userService.addUser(name, city);
        return String.format("%s added !!", name);
    }

    @GetMapping("/count")
    public String count() {
        return "Number of Users - " + Long.toString(userService.count());
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        Long userId = Long.parseLong(id);
        userService.deleteById(userId);
        return "User Deleted..!!";
    }

}
