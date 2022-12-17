package com.oracle.school.controller;

import com.oracle.school.randomuser.domain.RandomUser;
import com.oracle.school.service.RandomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/random/user")
public class RandomUserController {

    @Autowired
    private RandomUserService randomUserService;

    @PostMapping("/add")
    public RandomUser addRandomUser(@RequestBody RandomUser user) {
        return randomUserService.saveRandomUser(user);
    }

    @GetMapping("/getall")
    public List<RandomUser> getAllRandomUsers() {
        return randomUserService.getAllRandomUsers();
    }


}
