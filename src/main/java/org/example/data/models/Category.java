package org.example.data.models;

import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;

public class Category {
    @Id
    private String id;
    private String name;
    private String userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}