package com.aledev.santanderdevweek2023.service.impl;

import com.aledev.santanderdevweek2023.model.User;
import com.aledev.santanderdevweek2023.repository.UserRepository;
import com.aledev.santanderdevweek2023.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public User saveNewUser(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw  new IllegalArgumentException();
        }
        return userRepository.save(userToCreate);
    }
}
