package com.ac.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author wenqing.chen  2021/10/12 15:31
 **/
@Data
public class LoginDto implements Serializable {

    @NotBlank
    private String userName;

    @NotBlank
    private String password;
}
