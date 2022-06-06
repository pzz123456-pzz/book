package com.ac.service;

import com.ac.entity.LoginLog;

import java.util.List;

/**
 * @author wenqing.chen  2021/10/12 16:28
 **/
public interface LoginLogService {
    /**
     * 增加
     *
     * @param loginLog:
     * @return int
     * @author wenqing.chen  2021/10/12 16:32
     */
    int insertOne(LoginLog loginLog);

    /**
     * 查询所有
     *
     * @return java.util.List<com.ac.entity.LoginLog>
     * @author wenqing.chen  2021/10/12 19:15
     */
    List<LoginLog> selectAll();
}
