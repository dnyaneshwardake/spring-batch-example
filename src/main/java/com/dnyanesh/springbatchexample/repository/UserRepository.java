package com.dnyanesh.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dnyanesh.springbatchexample.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
