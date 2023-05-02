package com.example.todor.service;

import com.example.todor.model.Todo;
import com.example.todor.presenterImplementation.TodoPresenterImpl;
import com.example.todor.presenterInterface.TodoPresenter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("api")
@RestController
public class TodoService {
    private final TodoPresenter todoPresenter;

    public TodoService(TodoPresenter todoPresenter) {
        this.todoPresenter = todoPresenter;
    }

    // constructor

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return todoPresenter.getAllTodos();
    }

    @PostMapping("/todos")
    public void createTodo(@RequestBody Todo todo) {
        todoPresenter.createTodo(todo);
    }

    @PutMapping("/todos")
    public void updateTodo(@RequestBody Todo todo) {
        todoPresenter.updateTodo(todo);
    }

    @DeleteMapping("/todos/{id}")
    public void deleteTodoById(@PathVariable Long id) {
        todoPresenter.deleteTodoById(id);
    }
}

