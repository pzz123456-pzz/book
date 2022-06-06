package com.ac.service;

import com.ac.entity.User;
import com.ac.mapper.UserMapper;
import com.ac.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserMapper userMapper;

    @Test
    public void insertOne() {
        Mockito.when(userMapper.insertSelective(Mockito.any())).thenReturn(1);
        int i = userService.insertOne(new User());
        Assertions.assertEquals(i, 1);
    }

    @Test
    public void getUserByUserName() {
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        users.add(user);
        Mockito.when(userMapper.selectByExample(Mockito.any())).thenReturn(users);
        User userByUserName = userService.getUserByUserName("");
        Assertions.assertSame(userByUserName, user);
    }

    @Test
    public void getCountByCondition() {
        Mockito.when(userMapper.countByExample(Mockito.any())).thenReturn(1L);
        long countByCondition = userService.getCountByCondition(new User());
        Assertions.assertEquals(countByCondition, 1L);
    }

    @Test
    public void getUserByConditionPaging() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setUserId(1);
        users.add(user);
        String userName = "";
        int offset = 1;
        int size = 10;
        Mockito.when(userMapper.getUserByConditionPaging(userName, offset, size)).thenReturn(users);
        List<User> userByConditionPaging = userService.getUserByConditionPaging(userName, offset, size);
        Assertions.assertSame(userByConditionPaging, users);
    }
}