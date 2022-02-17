/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todoapp.todoproject.services;

import com.todoapp.todoproject.model.Todo;

import java.util.List;
/**
 *
 * @author Jesús Medina
 */
public class TodoService {
    List<Todo> getTodoList();
    
    Todo storeTodo(Todo todo);
    
    boolean deleteTodo(int id);
}
