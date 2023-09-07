package edu.icet.loginForm.service;

import edu.icet.loginForm.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public void add(User user);

    List<User> findAll();
}
