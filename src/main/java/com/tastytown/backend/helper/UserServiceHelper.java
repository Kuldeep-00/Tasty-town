package com.tastytown.backend.helper;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tastytown.backend.entity.User;
import com.tastytown.backend.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserServiceHelper {
    public final UserRepository repository;

     public User getUserById(String userId) {
        return repository.findById(userId)
                .orElseThrow(() -> new NoSuchElementException("User Not Found with Id" + userId));
    }

    
}
