package com.ac.controller;

import com.ac.dto.SimpleUserDto;
import com.ac.exception.BookException;
import com.ac.util.BookError;
import com.ac.util.ResponseResult;
import com.ac.util.ResponseResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;

/**
 * @author wenqing.chen  2021/10/12 13:34
 **/
@RestController
@RequestMapping("/data")
@Validated
@Slf4j
public class DataController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/hello2")
    public ResponseResult hello2() {
        return ResponseResultUtil.success("hello2");
    }

    @RequestMapping("/hello3")
    public ResponseResult hello3() {
        return ResponseResultUtil.fail(BookError.ERROR_1);
    }

    @RequestMapping("/hello4")
    public ResponseResult hello4() {
        throw new RuntimeException("未知错误");
    }

    @RequestMapping("/getId")
    public void getId(@Min(value = 1) Integer id) {
        log.info("id:{}", id);
    }

    @PostMapping("/getSimpleUserDto")
    public void getSimpleUserDto(@Validated @RequestBody SimpleUserDto simpleUserDto, Errors errors) {
        if(errors.hasErrors()){
            throw new BookException(errors);
        }
        log.info("simpleUserDto:{}", simpleUserDto);
    }

}
