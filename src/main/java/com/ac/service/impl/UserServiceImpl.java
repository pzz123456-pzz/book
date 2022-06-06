package com.ac.service.impl;

import com.ac.entity.User;
import com.ac.entity.UserExample;
import com.ac.mapper.UserMapper;
import com.ac.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wenqing.chen  2021/10/12 15:18
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public int save(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User selectById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int insertOne(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public User getUserByUserName(String userName) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        List<User> users = userMapper.selectByExample(userExample);
        return CollectionUtils.isEmpty(users) ? new User() : users.get(0);
    }

    @Override
    public long getCountByCondition(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if (StringUtils.isNotBlank(user.getUserName())) {
            criteria.andUserNameLike(user.getUserName());
        }
        return userMapper.countByExample(userExample);
    }

    @Override
    public List<User> getUserByConditionPaging(String userName, int offset, int size) {
        return userMapper.getUserByConditionPaging(userName, offset, size);
    }
}
