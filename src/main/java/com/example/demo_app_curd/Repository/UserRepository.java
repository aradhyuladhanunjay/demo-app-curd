package com.example.demo_app_curd.Repository;

import com.example.demo_app_curd.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}