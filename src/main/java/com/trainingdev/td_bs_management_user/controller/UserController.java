package com.trainingdev.td_bs_management_user.controller;

import com.trainingdev.td_bs_management_user.dto.UserDetail;
import com.trainingdev.td_bs_management_user.dto.UserProfile;
import com.trainingdev.td_bs_management_user.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("api/v1")
public class UserController {

    @PostMapping("/user")
    public UserDetail createUser(@RequestBody UserRequest userRequest){
        return new UserDetail();
    }

    @PutMapping("/user")
    public UserDetail updateUser(@RequestBody UserDetail userDetail){
        return new UserDetail();
    }

    @GetMapping("/user/{id}")
    public UserProfile getUserById(@PathVariable Integer id){
        return new UserProfile();
    }
}
