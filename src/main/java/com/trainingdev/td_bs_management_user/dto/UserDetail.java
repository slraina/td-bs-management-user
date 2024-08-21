package com.trainingdev.td_bs_management_user.dto;

import com.trainingdev.td_bs_management_user.enums.GenderEnum;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Setter
public class UserDetail {

    @NotNull
    private Integer id;

    @Size(max = 40, message = "name can't have more than 40 characters.")
    private String name;

    private LocalDate birthday	;

    @Size(max = 60, message = "email can't have more than 60 characters.")
    private String email;

    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "The password must have at least one uppercase letter, at least one lowercase letter, at least one number, at least one special character, minimum 8 characters."
    )
    private String password;


    private GenderEnum gender ;

    private String profilePhoto;

    private String coverPhoto;

    private LocalDateTime creationDate;

    private LocalDateTime modificationDate;


}


