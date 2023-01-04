/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.blog.repositories;

import com.blog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Vikas_Singh
 */
public interface CategoryRepo extends JpaRepository<Category, Integer>{
    
    
}
