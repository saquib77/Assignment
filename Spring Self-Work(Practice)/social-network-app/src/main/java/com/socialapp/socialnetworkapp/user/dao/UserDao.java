package com.socialapp.socialnetworkapp.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialapp.socialnetworkapp.entity.User;

public interface UserDao extends JpaRepository<User, Long> {}
