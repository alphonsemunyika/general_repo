package com.alphcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alphcode.repository.UserRepository;
import com.alphcode.entity.User;
public interface UserRepository extends JpaRepository<User, Long> {
}
