package org.example.services;

import org.example.data.models.User;
import org.example.data.repositories.UserRepository;
import org.example.dtos.request.UserRequest;
import org.example.dtos.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserResponse createUser(UserRequest request){

        if (request.getEmail() == null || request.getEmail().isEmpty()){
            throw new IllegalArgumentException("Email is required");
        }
        if (request.getPassword() == null || request.getPassword().isEmpty()){
            throw new IllegalArgumentException("Password is required");
        }
        User existing = repository.findByEmail(request.getEmail());
        if (existing != null){
            throw new IllegalArgumentException("User already exists");
        }
        User user = new User();
        user.email = request.getEmail();
        user.password = request.getPassword();
        user.name = request.getName();

        user.createdAt = LocalDateTime.now();
        user.updatedAt = LocalDateTime.now();

        User saved = repository.save(user);
        return createUser(saved);


    }

}
