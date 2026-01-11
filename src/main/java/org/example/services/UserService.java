package org.example.services;

import org.example.data.models.User;
import org.example.dtos.request.UserRequest;
import org.example.dtos.response.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse createUser(UserRequest request);
    UserResponse updateUser(UserRequest request);
    UserResponse deleteUser(UserRequest request);
    List<UserResponse> getAllUsers();
    UserResponse getUserById(String id);
}
