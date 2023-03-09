package com.ap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.entity.User;

@Repository
public interface WelcomeRepo extends JpaRepository<User, Integer>{

}
