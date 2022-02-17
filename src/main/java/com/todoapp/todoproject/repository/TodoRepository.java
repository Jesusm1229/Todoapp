/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todoapp.todoproject.repository;

import com.todoapp.todoproject.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Jesús Medina
 */


@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
