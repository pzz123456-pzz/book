package com.ac.service;

import com.ac.entity.User;

import java.util.List;

/**
 * @author wenqing.chen  2021/10/12 15:18
 **/
public interface UserService {
    public int save(User user);

    User selectById(int userId);

    /**
     * 增加
     *
     * @param user:
     * @return int
     * @author wenqing.chen  2021/10/12 15:27
     */
    int insertOne(User user);

    /**
     * 根据用户名查询用户
     *
     * @param userName:
     * @return com.ac.entity.User
     * @author wenqing.chen  2021/10/12 16:00
     */
    User getUserByUserName(String userName);

    /**
     * 根据条件查询
     *
     * @param user:
     * @return int
     * @author wenqing.chen  2021/10/12 16:50
     */
    long getCountByCondition(User user);

    /**
     * 分页查询
     *
     * @param userName:
     * @param offset:
     * @param size:
     * @return java.util.List<com.ac.entity.User>
     * @author wenqing.chen  2021/10/12 16:58
     */
    List<User> getUserByConditionPaging(String userName, int offset, int size);
}
