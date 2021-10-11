package com.socialapp.socialnetworkapp.service;

import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialapp.socialnetworkapp.entity.Post;
import com.socialapp.socialnetworkapp.entity.User;
import com.socialapp.socialnetworkapp.user.dao.UserDao;
import com.socialapp.socialnetworkapp.user.dao.UserPostDao;

@Service
public class UserImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserPostDao userPostDao;

	@Override
	public List<User> getAllUser() {
		return this.userDao.findAll();
	}

	@Override
	public User getUser(Long userId) {
		return this.userDao.getById(userId);
	}

	@Override
	public Post userPost(Long postId) {
		return this.userPostDao.getById(postId);
	}

	@Override
	public Optional<Post> getUserAllPost(Long userId) {
		return this.userPostDao.findById(userId);
	}

	@Override
	public User createUser(User user) {
		return this.userDao.save(user);
	}

	@Override
	public User updateUser(User user) {
		return this.userDao.save(user);
	}

	@Override
	public Integer deleteUser(Long userId) {
		Integer res=0;
		try {
			this.userDao.deleteById(userId);
			res = 1;
		}catch(Exception e) {
			return 0;
		}
		return res;
	}

	@Override
	public Post addPost(Post post) {
		return this.userPostDao.save(post);
	}

	@Override
	public Post updatePost(Post post) {
		return this.userPostDao.save(post);
	}

	@Override
	public void deletePost(Post post) {
		this.userPostDao.delete(post);
	}

}
