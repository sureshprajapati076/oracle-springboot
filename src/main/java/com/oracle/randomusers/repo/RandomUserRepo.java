package com.oracle.randomusers.repo;

import com.oracle.randomusers.randomuser.domain.RandomUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RandomUserRepo extends JpaRepository<RandomUser, Long> {
}
