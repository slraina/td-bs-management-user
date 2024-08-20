package com.trainingdev.td_bs_management_user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comment {

    private String id;
    private UserComment user;
    private String description;
    private String creationDate;
}
