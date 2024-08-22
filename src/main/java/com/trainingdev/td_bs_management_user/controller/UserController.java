package com.trainingdev.td_bs_management_user.controller;

import com.trainingdev.td_bs_management_user.dto.UserDetail;
import com.trainingdev.td_bs_management_user.dto.UserProfile;
import com.trainingdev.td_bs_management_user.dto.UserRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController()
@RequestMapping("api/v1")
public class UserController {

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDetail createUser(@RequestBody @Valid UserRequest userRequest){

        UserDetail userDetail = new UserDetail();
        userDetail.setId(1);
        userDetail.setName(userRequest.getFirstName() + userRequest.getLastName());
        userDetail.setBirthday(userRequest.getBirthday());
        userDetail.setEmail(userRequest.getEmail());
        userDetail.setPassword(userRequest.getPassword());
        userDetail.setGender(userRequest.getGender());
        userDetail.setCoverPhoto("coverPhoto.png");
        userDetail.setProfilePhoto("profilePhoto.png");
        userDetail.setCreationDate(LocalDateTime.now());
        userDetail.setModificationDate(LocalDateTime.now());

        return userDetail;
    }

    @PutMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    public UserDetail updateUser(@RequestBody UserDetail userDetail){
        UserDetail userDetailResponse = new UserDetail();
        userDetailResponse.setId(userDetail.getId());
        userDetailResponse.setName(userDetail.getName());

        return userDetailResponse;
    }

    @GetMapping("/user/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserProfile getUserById(@PathVariable Integer id){
        return new UserProfile();
    }
}
