package com.trainingdev.td_bs_management_user.dto;

import com.trainingdev.td_bs_management_user.enums.FeelingEnum;
import com.trainingdev.td_bs_management_user.enums.PostTypeEnum;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostDetail {

    @NotNull
    private Integer id;

    private Integer userId;

    private PostTypeEnum type;

    private FeelingEnum feeling;

    private String description;

    private String image;

    private LocalDateTime creationDate;

    private LocalDateTime modificationDate;

    private List<Comment> commentList;
}
