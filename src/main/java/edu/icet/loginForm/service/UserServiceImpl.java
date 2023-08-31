package edu.icet.loginForm.service;

import edu.icet.loginForm.dto.User;
import edu.icet.loginForm.dao.UserEntity;
import edu.icet.loginForm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository repository;

    @Override
    public void add(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFullName(user.getFullName());
        userEntity.setNameWithInitials(user.getNameWithInitials());
        userEntity.setAge(user.getAge());
        userEntity.setEmail(user.getEmail());
        userEntity.setPassword(user.getPassword());
        repository.save(userEntity);
    }

}
