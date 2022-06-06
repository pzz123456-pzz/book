package com.ac.controller;

import com.ac.dto.LoginDto;
import com.ac.dto.UserDto;
import com.ac.entity.LoginLog;
import com.ac.entity.User;
import com.ac.exception.BookException;
import com.ac.service.LoginLogService;
import com.ac.service.UserService;
import com.ac.util.BookError;
import com.ac.util.ResponseResult;
import com.ac.util.ResponseResultUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

/**
 * @author wenqing.chen  2021/10/12 15:15
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private LoginLogService loginLogService;

    @GetMapping("/user")
    public int Test1(User user){
        return userService.save(user);
    }

    @PostMapping("/register")
    public void register(@Validated @RequestBody UserDto userDto, Errors errors) {
        if (errors.hasErrors()) {
            throw new BookException(errors);
        }
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        user.setUserType(2);
        userService.insertOne(user);
    }

    @PostMapping("/login")
    public ResponseResult login(@Validated @RequestBody LoginDto loginDto, Errors errors) {
        if (errors.hasErrors()) {
            throw new BookException(errors);
        }
        ResponseResult responseResult;
        User user = userService.getUserByUserName(loginDto.getUserName());
        if (user.getPassword() == null) {
            //用户不存在
            responseResult = ResponseResultUtil.fail(BookError.ERROR_1);
        } else if (!StringUtils.equals(user.getPassword(), loginDto.getPassword())) {
            //用户密码醋味
            responseResult = ResponseResultUtil.fail(BookError.ERROR_2);
        } else {
            LocalDateTime now = LocalDateTime.now();
            if (now.isBefore(user.getValidStartTime()) || now.isAfter(user.getValidEndTime())) {
                //用户已过期
                responseResult = ResponseResultUtil.fail(BookError.ERROR_3);
            } else {
                //通过
                //日志记录
                LoginLog loginLog = new LoginLog();
                loginLog.setUserId(user.getUserId());
                loginLog.setUserType(user.getUserType());
                loginLog.setLoginDateTime(now);
                loginLogService.insertOne(loginLog);

                responseResult = ResponseResultUtil.success(user);
            }
        }
        return responseResult;
    }

    /**
     * @param user:
     * @param page: 当前页数
     * @param size: 每页显示数
     * @return com.ac.util.ResponseResult
     * @author wenqing.chen  2021/10/12 17:49
     */
    @GetMapping("/getByCondition")
    public HashMap<String, Object> getByCondition(@RequestBody User user, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        //查询总数量
        long total = userService.getCountByCondition(user);
        //查询当前页数的显示数据
        List<User> list = userService.getUserByConditionPaging(user.getUserName(), (page - 1) * size, size);
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("total", total);
        stringObjectHashMap.put("data", list);
        return stringObjectHashMap;
    }


}
