package com.trainingdev.td_bs_management_user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDetail {
    private int id;
    private int userId;
    private String type;
    private String feeling;
    private String description;
    private String image;
    private String creationDate;
    private String modificationDate;
    private Comment commentList;
}
