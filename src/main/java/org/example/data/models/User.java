package org.example.data.models;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class User {
    @Id
    private String id;
    private String email;
    private String password;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
