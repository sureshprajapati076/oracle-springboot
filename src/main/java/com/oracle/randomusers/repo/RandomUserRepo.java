package com.oracle.randomusers.repo;

import com.oracle.randomusers.randomuser.domain.RandomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RandomUserRepo extends PagingAndSortingRepository<RandomUser, Long>, JpaRepository<RandomUser,Long> {
}
