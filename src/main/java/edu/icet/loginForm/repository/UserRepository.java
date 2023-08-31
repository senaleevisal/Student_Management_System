package edu.icet.loginForm.repository;

import edu.icet.loginForm.dao.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Integer> {
}
