package com.oracle.school.service;

import com.oracle.school.randomuser.domain.RandomUser;

import java.util.List;
import java.util.Random;

public interface RandomUserService {
    List<RandomUser> getAllRandomUsers();
    RandomUser saveRandomUser(RandomUser user);
}