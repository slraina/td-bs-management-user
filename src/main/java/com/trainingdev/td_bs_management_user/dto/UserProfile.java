package com.trainingdev.td_bs_management_user.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {
    private UserDetail userDetail;
    private List<PostDetail> postList;
}
