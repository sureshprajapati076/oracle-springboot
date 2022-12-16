package com.oracle.school.service;

import com.oracle.school.SchoolApplication;
import com.oracle.school.model.MySchool;

import java.util.List;

public interface MySchoolService {
    List<MySchool> getAll();
    MySchool saveSchool(MySchool school);
}
