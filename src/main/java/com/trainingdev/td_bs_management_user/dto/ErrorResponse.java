package com.trainingdev.td_bs_management_user.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {

    private String code;
    private String message;
}
