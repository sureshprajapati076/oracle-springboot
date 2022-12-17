package com.oracle.school.service;

import com.oracle.school.model.MySchool;
import com.oracle.school.repo.MySchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySchoolServiceImpl implements MySchoolService{

    private final MySchoolRepo mySchoolRepo;

    public MySchoolServiceImpl(MySchoolRepo mySchoolRepo) {
        this.mySchoolRepo = mySchoolRepo;
    }


    @Override
    public List<MySchool> getAll() {
        return mySchoolRepo.findAll();
    }

    @Override
    public MySchool saveSchool(MySchool school) {
        return mySchoolRepo.save(school);
    }
}
