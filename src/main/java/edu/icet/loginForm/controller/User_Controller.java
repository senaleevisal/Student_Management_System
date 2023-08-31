package edu.icet.loginForm.controller;

import edu.icet.loginForm.dto.User;
import edu.icet.loginForm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Slf4j
@RequestMapping("/user")
public class User_Controller {

    @Autowired
    UserService userService;

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.add(user);
    }
}
