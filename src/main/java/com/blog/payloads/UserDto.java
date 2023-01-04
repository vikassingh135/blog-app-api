/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

/**
 *
 * @author Vikas_Singh
 */
public class UserDto {
    
    private int id;
    
    @NotEmpty
    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
    private String name;
    @Email(message = "Please enter valid email id")
    private String email;
    @NotEmpty
    @Size(min = 3, max = 15, message = "Password must be between 3 and 15 characters")
    private String password;
    @NotEmpty(message = "About must not be empty")
    private String about;

    public UserDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    
}
