package com.oracle.randomusers.controller;

import com.oracle.randomusers.randomuser.domain.RandomUser;
import com.oracle.randomusers.service.RandomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/random/user")
public class RandomUserController {

    private final RandomUserService randomUserService;

    public RandomUserController(RandomUserService randomUserService) {
        this.randomUserService = randomUserService;
    }

    @PostMapping("/add")
    public RandomUser addRandomUser(@RequestBody RandomUser user) {
        return randomUserService.saveRandomUser(user);
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAllRandomUsers(@RequestHeader HttpHeaders headers, @RequestParam(name = "pageNo", defaultValue = "0") Integer pageNo) {
        System.out.println("HELLO");
        if(Objects.requireNonNull(headers.get("sid")).contains("10111") && Objects.requireNonNull(headers.get("sesion")).contains("valid") && Objects.requireNonNull(headers.get("active")).contains("true")){
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("responseSid","MYSID");
            responseHeaders.set("MyResponseHeader", "MyValue");
            List<RandomUser> listResult = randomUserService.getAllRandomUsers(pageNo);
            return new ResponseEntity<>(listResult, responseHeaders, HttpStatus.CREATED);
        }
        return ResponseEntity.ok(Collections.emptyList());
    }


}
