package com.oracle.randomusers.service;

import com.oracle.randomusers.randomuser.domain.RandomUser;

import java.util.List;

public interface RandomUserService {
    List<RandomUser> getAllRandomUsers(Integer pageNo);

    RandomUser saveRandomUser(RandomUser user);
}
