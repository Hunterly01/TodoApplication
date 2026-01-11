package org.example.dtos.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CategoryRequest {
    private String name;
    private String userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
