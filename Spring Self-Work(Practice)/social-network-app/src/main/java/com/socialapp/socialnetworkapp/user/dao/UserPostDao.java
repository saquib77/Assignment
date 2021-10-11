package com.socialapp.socialnetworkapp.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialapp.socialnetworkapp.entity.Post;

public interface UserPostDao extends JpaRepository<Post, Long>{

}
