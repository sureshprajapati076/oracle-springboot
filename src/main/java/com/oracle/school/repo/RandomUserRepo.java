package com.oracle.school.repo;

import com.oracle.school.randomuser.domain.RandomUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RandomUserRepo extends JpaRepository<RandomUser, Long> {
}
