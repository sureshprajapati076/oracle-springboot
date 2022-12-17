package com.oracle.school.service;

import com.oracle.school.randomuser.domain.RandomUser;
import com.oracle.school.repo.RandomUserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RandomUserServiceImpl implements RandomUserService{

    private final RandomUserRepo randomUserRepo;

    public RandomUserServiceImpl(RandomUserRepo randomUserRepo){
        this.randomUserRepo=randomUserRepo;
    }

    @Override
    public List<RandomUser> getAllRandomUsers() {
        return randomUserRepo.findAll();
    }

    @Override
    public RandomUser saveRandomUser(RandomUser user) {
        return randomUserRepo.save(user);
    }
}
