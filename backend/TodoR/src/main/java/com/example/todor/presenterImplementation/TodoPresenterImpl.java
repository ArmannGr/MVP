package com.example.todor.presenterImplementation;

import com.example.todor.model.Todo;
import com.example.todor.presenterInterface.TodoPresenter;
import com.example.todor.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoPresenterImpl implements TodoPresenter {

    @Autowired
    private TodoRepository todoRepository;

    // constructor

    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public void createTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void deleteTodoById(Long id) {
        todoRepository.deleteById(id);
    }
}

