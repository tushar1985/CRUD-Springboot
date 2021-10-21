package com.emp.myemp.repository;

import com.emp.myemp.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<user, Long>{
}
