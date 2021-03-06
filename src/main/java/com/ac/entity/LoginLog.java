package com.ac.entity;

import java.time.LocalDateTime;

/**
 * Database Table Remarks:
 *   登录日志
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table login_log
 */
public class LoginLog {
    /**
     * Database Column Remarks:
     *   日志ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_log.log_id
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    private Integer logId;

    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_log.user_id
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    private Integer userId;

    /**
     * Database Column Remarks:
     *   用户级别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_log.user_type
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    private Integer userType;

    /**
     * Database Column Remarks:
     *   登录日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_log.login_date_time
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    private LocalDateTime loginDateTime;

    /**
     * Database Column Remarks:
     *   创建日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_log.create_date_time
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    private LocalDateTime createDateTime;

    /**
     * Database Column Remarks:
     *   更新日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_log.update_date_time
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    private LocalDateTime updateDateTime;

    /**
     * Database Column Remarks:
     *   删除flag
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_log.delete_flag
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    private Boolean deleteFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_log.log_id
     *
     * @return the value of login_log.log_id
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_log.log_id
     *
     * @param logId the value for login_log.log_id
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_log.user_id
     *
     * @return the value of login_log.user_id
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_log.user_id
     *
     * @param userId the value for login_log.user_id
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_log.user_type
     *
     * @return the value of login_log.user_type
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_log.user_type
     *
     * @param userType the value for login_log.user_type
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_log.login_date_time
     *
     * @return the value of login_log.login_date_time
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public LocalDateTime getLoginDateTime() {
        return loginDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_log.login_date_time
     *
     * @param loginDateTime the value for login_log.login_date_time
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public void setLoginDateTime(LocalDateTime loginDateTime) {
        this.loginDateTime = loginDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_log.create_date_time
     *
     * @return the value of login_log.create_date_time
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_log.create_date_time
     *
     * @param createDateTime the value for login_log.create_date_time
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_log.update_date_time
     *
     * @return the value of login_log.update_date_time
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_log.update_date_time
     *
     * @param updateDateTime the value for login_log.update_date_time
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_log.delete_flag
     *
     * @return the value of login_log.delete_flag
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_log.delete_flag
     *
     * @param deleteFlag the value for login_log.delete_flag
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", userId=").append(userId);
        sb.append(", userType=").append(userType);
        sb.append(", loginDateTime=").append(loginDateTime);
        sb.append(", createDateTime=").append(createDateTime);
        sb.append(", updateDateTime=").append(updateDateTime);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LoginLog other = (LoginLog) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getLoginDateTime() == null ? other.getLoginDateTime() == null : this.getLoginDateTime().equals(other.getLoginDateTime()))
            && (this.getCreateDateTime() == null ? other.getCreateDateTime() == null : this.getCreateDateTime().equals(other.getCreateDateTime()))
            && (this.getUpdateDateTime() == null ? other.getUpdateDateTime() == null : this.getUpdateDateTime().equals(other.getUpdateDateTime()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_log
     *
     * @mbg.generated Tue Oct 12 16:27:57 CST 2021
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getLoginDateTime() == null) ? 0 : getLoginDateTime().hashCode());
        result = prime * result + ((getCreateDateTime() == null) ? 0 : getCreateDateTime().hashCode());
        result = prime * result + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        return result;
    }
}