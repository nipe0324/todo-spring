package com.example.todo.service;

import com.example.todo.model.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    List<Todo> getAllTodos();

    Optional<Todo> getTodoById(Long id);

    Todo createTodo(Todo todo);

    Todo updateTodo(Long id, Todo todoDetails);

    void deleteTodo(Long id);

    List<Todo> findByCompleted(boolean completed);

    List<Todo> searchByTitle(String keyword);
}
