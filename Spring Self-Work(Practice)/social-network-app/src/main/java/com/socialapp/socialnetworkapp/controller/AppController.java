package com.socialapp.socialnetworkapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.socialapp.socialnetworkapp.entity.*;
import com.socialapp.socialnetworkapp.service.UserService;

import java.util.*;

@RestController
public class AppController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String homePage() {
		return "This is Home Page";
	}
	
	//Add User
	@PostMapping("/socialapp")
	public User createUser(@RequestBody User user) {
		return this.userService.createUser(user);
	}
	
	//Update User
	@PutMapping("/socialapp")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);	
	}
	
	//Delete User
	@DeleteMapping("/socialapp/{userId}")
	public Integer deleteUser(@PathVariable String userId) {
		return this.userService.deleteUser(Long.parseLong(userId));
	}
	
	//GetAllUsers
	@GetMapping("/socialapp/users")
	public List<User> getAllUsers(){
		return this.userService.getAllUser();
	}
	
	
	//Get Particular User
	@GetMapping("/socialapp/user/{userId}")
	public User getUser(@PathVariable Long userId) {
		return this.userService.getUser(userId);
	}
	
	
	//Get User Post
	@GetMapping("/socialapp/user/post/{postId}")
	public Post getUserPost(@PathVariable("postId") Long postId) {
		return this.userService.userPost(postId);
	}
	
	//Get User All Posts
	@GetMapping("/socialapp/user/{userId}")
	public Optional<Post> getAllPost(@PathVariable Long userId){
		return this.userService.getUserAllPost(userId);
	}
}
