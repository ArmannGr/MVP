package com.example.todor.repository;

import com.example.todor.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    Todo findTodoById(Long id);
}

