package com.example.todor.service;

import com.example.todor.model.Todo;
import com.example.todor.presenterInterface.TodoPresenter;
import com.example.todor.repository.TodoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("api")
@RestController
public class TodoService {
    private final TodoPresenter todoPresenter;
    private final TodoRepository todoRepository;

    public TodoService(TodoPresenter todoPresenter, TodoRepository todoRepository) {
        this.todoPresenter = todoPresenter;
        this.todoRepository = todoRepository;
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

    @PutMapping("/todos/{id}")
    public Todo updateTodo(@PathVariable Long id) {
        return todoPresenter.updateTodo(todoRepository.findTodoById(id));
    }

    @DeleteMapping("/todos/{id}")
    public void deleteTodoById(@PathVariable Long id) {
        todoPresenter.deleteTodoById(id);
    }
}

