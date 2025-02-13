package com.aledev.santanderdevweek2023.service;


import com.aledev.santanderdevweek2023.model.User;

public interface UserService {

    User findById(Long id);

    User saveNewUser(User userToCreate);
}
