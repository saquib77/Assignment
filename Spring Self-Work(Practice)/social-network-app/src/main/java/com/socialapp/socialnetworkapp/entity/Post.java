package com.socialapp.socialnetworkapp.entity;

import javax.persistence.*;

@Entity
public class Post {
	private Long userId;
	
	@Id
	private Integer postId;
	private String post;
	private Integer postLike;
	private Integer postComments;
	public Post() {}
	public Post(Long userId, Integer postId, String post, Integer postLike, Integer postComments) {
		super();
		this.userId = userId;
		this.postId = postId;
		this.post = post;
		this.postLike = postLike;
		this.postComments = postComments;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public Integer getPostLike() {
		return postLike;
	}
	public void setPostLike(Integer postLike) {
		this.postLike = postLike;
	}
	public Integer getPostComments() {
		return postComments;
	}
	public void setPostComments(Integer postComments) {
		this.postComments = postComments;
	}
	@Override
	public String toString() {
		return "Post [userId=" + userId + ", postId=" + postId + ", post=" + post + ", postLike=" + postLike
				+ ", postComments=" + postComments + "]";
	}
	
	
	
}
