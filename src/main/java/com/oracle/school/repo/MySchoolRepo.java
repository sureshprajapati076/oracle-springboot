package com.oracle.school.repo;

import com.oracle.school.model.MySchool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySchoolRepo extends JpaRepository<MySchool,Long> {
}
