package com.ac.mapper;

import com.ac.entity.LoginLog;
import com.ac.entity.LoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    long countByExample(LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    int deleteByExample(LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    int deleteByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    int insert(LoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    int insertSelective(LoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    List<LoginLog> selectByExample(LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    LoginLog selectByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    int updateByExampleSelective(@Param("record") LoginLog record, @Param("example") LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    int updateByExample(@Param("record") LoginLog record, @Param("example") LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    int updateByPrimaryKeySelective(LoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    int updateByPrimaryKey(LoginLog record);
}