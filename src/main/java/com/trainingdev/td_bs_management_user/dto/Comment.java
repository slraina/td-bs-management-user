package com.trainingdev.td_bs_management_user.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private String id;
    private UserComment user;
    private String description;
    private LocalDateTime creationDate;
}
