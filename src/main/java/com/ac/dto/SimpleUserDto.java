package com.ac.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author wenqing.chen  2021/10/12 14:39
 **/
@Data
public class SimpleUserDto implements Serializable {

    private Integer id;

    @NotBlank
    private String name;

    private int age;
}
