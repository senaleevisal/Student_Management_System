package edu.icet.loginForm.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String fullName;
    private String nameWithInitials;
    private int age;
    private String phoneNumber;
    private String email;
    private String password;
    private String parentName;
    private String parentMobile;
    private String parentEmail;
}
