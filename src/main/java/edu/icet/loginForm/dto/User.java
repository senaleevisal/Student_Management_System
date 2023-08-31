package edu.icet.loginForm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
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
