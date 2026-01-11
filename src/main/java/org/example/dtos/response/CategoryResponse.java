package org.example.dtos.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CategoryResponse {
    private String id;
    private String name;
    private String userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
