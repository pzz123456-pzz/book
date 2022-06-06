package com.ac.dto;

import lombok.Data;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author wenqing.chen  2021/10/12 15:21
 **/
@Data
public class UserDto implements Serializable {

    @NotBlank
    private String userName;

    @NotBlank
    private String password;

    private String email;

    private LocalDate birthday;

    private Boolean gender;

    private Integer grade;

    private String interest;

    @NotBlank
    @Past
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime validStartTime;

    @NotBlank
    @Future
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime validEndTime;
}
