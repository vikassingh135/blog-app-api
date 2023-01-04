/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.services;

import com.blog.payloads.CategoryDto;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vikas_Singh
 */
public interface CategoryService {
    
    //create
    CategoryDto createCategory(CategoryDto categoryDto);
    //update
    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
    //delete
    void deleteCategory(Integer categoryId);
    //getAll
    List<CategoryDto> getCategories();
    //getSingle
    CategoryDto getCategory(Integer categoryId);
    
}
