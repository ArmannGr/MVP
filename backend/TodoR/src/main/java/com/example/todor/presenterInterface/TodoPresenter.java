package com.example.todor.presenterInterface;

import com.example.todor.model.Todo;

import java.util.List;

public interface TodoPresenter {
    List<Todo> getAllTodos();
    void createTodo(Todo todo);
    Todo updateTodo(Todo todo);
    void deleteTodoById(Long id);
}

