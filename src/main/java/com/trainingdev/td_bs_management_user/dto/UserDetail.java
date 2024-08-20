package com.trainingdev.td_bs_management_user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetail {

    private int id;
    private String name;
    private String birthday	;
    private String email;
    private String password;
    private String gender ;
    private String profilePhoto;
    private String coverPhoto;
    private String creationDate;
    private String modificationDate;


}


