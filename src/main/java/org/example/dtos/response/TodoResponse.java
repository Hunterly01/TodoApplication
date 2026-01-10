package org.example.dtos.response;

import lombok.Data;

@Data
public class TodoResponse {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
