package com.ac.service.impl;

import com.ac.entity.LoginLog;
import com.ac.mapper.LoginLogMapper;
import com.ac.service.LoginLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wenqing.chen  2021/10/12 16:28
 **/
@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Resource
    private LoginLogMapper loginLogMapper;

    @Override
    public int insertOne(LoginLog loginLog) {
        return loginLogMapper.insertSelective(loginLog);
    }

    @Override
    public List<LoginLog> selectAll() {
        return loginLogMapper.selectByExample(null);
    }
}
