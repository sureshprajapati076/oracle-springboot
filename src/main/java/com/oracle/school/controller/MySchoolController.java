package com.oracle.school.controller;

import com.oracle.school.model.MySchool;
import com.oracle.school.service.MySchoolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MySchoolController {

    @Autowired
    private MySchoolService schoolService;

    @GetMapping("/findall")
    public List<MySchool> findAll() {
        return schoolService.getAll();
    }

    @PostMapping("/add")
    public MySchool addNewSchool(@RequestBody MySchool school) {
        return schoolService.saveSchool(school);
    }
}
