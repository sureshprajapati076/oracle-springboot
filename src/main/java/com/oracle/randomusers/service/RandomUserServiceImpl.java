package com.oracle.randomusers.service;

import com.oracle.randomusers.randomuser.domain.RandomUser;
import com.oracle.randomusers.repo.RandomUserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RandomUserServiceImpl implements RandomUserService {

    private final RandomUserRepo randomUserRepo;

    public RandomUserServiceImpl(RandomUserRepo randomUserRepo) {
        this.randomUserRepo = randomUserRepo;
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
