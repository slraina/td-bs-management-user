package com.trainingdev.td_bs_management_user.dto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRequest {

    private String firstName;
    private String lastName;
    private String birthday;
    private String email;
    private String password;
    private String gender;

}
