package com.oracle.randomusers.service;

import com.oracle.randomusers.randomuser.domain.RandomUser;
import com.oracle.randomusers.repo.RandomUserRepo;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class RandomUserServiceImpl implements RandomUserService {

    private final RandomUserRepo randomUserRepo;

    public RandomUserServiceImpl(RandomUserRepo randomUserRepo) {
        this.randomUserRepo = randomUserRepo;
    }

    @Override
    public List<RandomUser> getAllRandomUsers(Integer pageNumber) {
        return randomUserRepo.findAll(PageRequest.of(pageNumber,5)).getContent();
        //return randomUserRepo.findAll();
    }

    @Override
    public RandomUser saveRandomUser(RandomUser user) {
        return randomUserRepo.save(user);
    }
}
