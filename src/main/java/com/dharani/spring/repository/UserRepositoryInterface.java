package com.dharani.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dharani.entity.User;

@Repository
public interface UserRepositoryInterface extends JpaRepository<User , Long> {

}
