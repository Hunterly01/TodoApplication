package org.example.data.models;

import lombok.Data;

@Data
public class Todo {
    private  String id;
    private  String title;
    private  String content;
    private boolean completed = false;

}
