package com.trainingdev.td_bs_management_user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserProfile {
    private UserDetail userDetail;
    private PostDetail postList;
}
