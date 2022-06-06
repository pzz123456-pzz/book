package com.ac.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author: zhanzheng.pang
 * @time: 2021/10/19
 */
@Data
public class BookDto implements Serializable {

    private int bookId;

    @NotBlank
    private String authorName;

    @NotBlank
    private String publisherName;

    @NotBlank
    private String bookName;

    @NotNull
    private int quantity;

    @Past
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime creadeDateTime;

    @Future
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateDateTime;

    private byte deleteFlag;


}
