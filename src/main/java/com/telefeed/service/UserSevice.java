package com.telefeed.service;

import com.telefeed.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ruslan Idrisov
 */
@Service
public class UserSevice {
    @Autowired
    private UserRepo userRepo;

}