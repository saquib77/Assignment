package com.socialapp.socialnetworkapp.service;

import java.util.*;

import com.socialapp.socialnetworkapp.entity.*;

public interface UserService {
	
	//CreateUser
	public User createUser(User user);
	
	//Update User
	public User updateUser(User user);
	
	//Delete User
	public Integer deleteUser(Long userId);
	
	
	//Get All Users
	public List<User> getAllUser();
	
	//Get Single User
	public User getUser(Long userId);
	
	//Add a post
	public Post addPost(Post post);
	
	//Get Users post
	public Post userPost(Long postId);
	
	//Get user All Post
	public Optional<Post> getUserAllPost(Long userId);
	
	//Update Post
	public Post updatePost(Post post);
	
	//Delete Post
	public void deletePost(Post post);
}
