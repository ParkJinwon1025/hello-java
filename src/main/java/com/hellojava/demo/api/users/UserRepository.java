package com.hellojava.demo.api.users;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hellojava.demo.domain.User;


public interface UserRepository extends JpaRepository<User, Long> {
    
}
