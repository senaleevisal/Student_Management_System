package edu.icet.loginForm.service;

import edu.icet.loginForm.dto.User;
import edu.icet.loginForm.dao.UserEntity;
import edu.icet.loginForm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    @Override
    public List<User> findAll() {
        Iterable<UserEntity> userList = repository.findAll();
        Iterator<UserEntity> iterator = userList.iterator();
        List<User> userModels = new ArrayList<>();

        while(iterator.hasNext()){
            UserEntity user = iterator.next();

            userModels.add(
                    User.builder().
                            fullName(user.getFullName()).
                            nameWithInitials(user.getNameWithInitials()).
                            age(user.getAge()).
                            email(user.getEmail()).
                            phoneNumber(user.getPhoneNumber()).
                            parentName(user.getParentName()).
                                build()
            );
        }
        return userModels;
    }

}
