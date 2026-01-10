package org.example.services;

import org.example.dtos.request.TodoRequest;
import org.example.dtos.response.TodoResponse;

import java.util.List;

public interface TodoService {
    TodoResponse createTodo(TodoRequest todoRequest);
    TodoResponse updateTodo(TodoRequest todoRequest);
    TodoResponse deleteTodo(TodoRequest todoRequest);
    List<TodoResponse> getAllTodos();
    TodoResponse toggleCompleted(TodoRequest todoRequest);
}
