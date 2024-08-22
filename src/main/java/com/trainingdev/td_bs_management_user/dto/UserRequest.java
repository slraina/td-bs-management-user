package com.trainingdev.td_bs_management_user.dto;
import com.trainingdev.td_bs_management_user.enums.GenderEnum;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class UserRequest {

    @NotEmpty(message = "firstName cannot be empty")
    @Size(max = 20, message = "firstName can't have more than 20 characters.")
    private String firstName;

    @NotEmpty(message = "lastName cannot be empty")
    @Size(max = 20, message = "lastName can't have more than 20 characters.")
    private String lastName;

    @NotNull(message = "birthday cannot be empty")
    private LocalDate birthday;

    @NotEmpty(message = "firstName cannot be empty")
    @Size(max = 60, message = "email can't have more than 20 characters.")
    @Email
    private String email;

    @NotEmpty(message = "password cannot be empty")
    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "The password must have at least one uppercase letter, at least one lowercase letter, at least one number, at least one special character, minimum 8 characters."
    )
    private String password;

    @NotNull(message = "Gender cannot be null.")
    private GenderEnum gender;

}
