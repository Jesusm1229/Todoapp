/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todoapp.todoproject.services;

import com.todoapp.todoproject.model.Todo;
import com.todoapp.todoproject.model.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author Jesús Medina
 */
@Service
@Transactional
public class TodoServiceImpl implements TodoService{
    
    private final TodoRepository todoRepository
    
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getTodoList() {
        return todoRepository.findAll();
    }

    @Override
    public Todo getTodo(int id) {
        Optional<Todo> todo = todoRepository.findById(id);
        return todo.orElse(null);
    }

    @Override
    public Todo storeTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public boolean deleteTodo(int id) {
        boolean deleted = false;
        Optional<Todo> todo = todoRepository.findById(id);

        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
            deleted = true;
        }
        return deleted;
    }
}
