package com.telefeed.repos;

import com.telefeed.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ruslan Idrisov
 */
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
