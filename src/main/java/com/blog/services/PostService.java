/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.blog.services;

import com.blog.entities.Post;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;
import java.util.List;

/**
 *
 * @author Vikas_Singh
 */
public interface PostService {
    
    
    // create
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
    
    //update
    PostDto updatePost(PostDto postDto, Integer postId);
    
    //delete
    void deletePost(Integer postId);
    
    //get alll posts
    PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy);
    
    //get single post
    PostDto getPostById(Integer postId);
    
    //get all post by category
    List<PostDto> getPostByCategory(Integer categoryId);
    
    //get all posts by user
    List<PostDto> getPostByUser(Integer userId);
    
    List<PostDto> searchPost(String title);
}
