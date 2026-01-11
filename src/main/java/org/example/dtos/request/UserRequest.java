package org.example.dtos.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserRequest {
    private String email;
    private String password;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
