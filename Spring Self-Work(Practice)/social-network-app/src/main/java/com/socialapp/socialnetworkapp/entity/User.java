package com.socialapp.socialnetworkapp.entity;

import javax.persistence.*;

@Entity
public class User {
	
	@Id
	private Long userId;
	private String userFirstName;
	private String userLastName;
	private String userEmailId;
	private Integer userPhoneNum;
	private Integer userPostsCount;
	private Integer userFriends;
	private Integer userAllPosts;
	public User() {}
	public User(Long userId, String userFirstName, String userLastName, String userEmailId, Integer userPhoneNum,
			Integer userPostsCount, Integer userFriends, Integer userAllPosts) {
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmailId = userEmailId;
		this.userPhoneNum = userPhoneNum;
		this.userPostsCount = userPostsCount;
		this.userFriends = userFriends;
		this.userAllPosts = userAllPosts;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public Integer getUserPhoneNum() {
		return userPhoneNum;
	}
	public void setUserPhoneNum(Integer userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}
	public Integer getUserPostsCount() {
		return userPostsCount;
	}
	public void setUserPostsCount(Integer userPostsCount) {
		this.userPostsCount = userPostsCount;
	}
	public Integer getUserFriends() {
		return userFriends;
	}
	public void setUserFriends(Integer userFriends) {
		this.userFriends = userFriends;
	}
	public Integer getUserAllPosts() {
		return userAllPosts;
	}
	public void setUserAllPosts(Integer userAllPosts) {
		this.userAllPosts = userAllPosts;
	}
	
	
	
	
}
