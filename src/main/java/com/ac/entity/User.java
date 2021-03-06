package com.ac.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Database Table Remarks:
 *   用户信息表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user
 */
public class User {
    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private Integer userId;

    /**
     * Database Column Remarks:
     *   用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private String userName;

    /**
     * Database Column Remarks:
     *   密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private String password;

    /**
     * Database Column Remarks:
     *   用户类型1：管理员2：用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_type
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private Integer userType;

    /**
     * Database Column Remarks:
     *   邮箱
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private String email;

    /**
     * Database Column Remarks:
     *   生日
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private LocalDate birthday;

    /**
     * Database Column Remarks:
     *   性别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gender
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private Boolean gender;

    /**
     * Database Column Remarks:
     *   年级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.grade
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private Integer grade;

    /**
     * Database Column Remarks:
     *   兴趣，多个兴趣用,分隔
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.interest
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private String interest;

    /**
     * Database Column Remarks:
     *   有效期开始时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.valid_start_time
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private LocalDateTime validStartTime;

    /**
     * Database Column Remarks:
     *   有效期结束时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.valid_end_time
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private LocalDateTime validEndTime;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_date_time
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private LocalDateTime createDateTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_date_time
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private LocalDateTime updateDateTime;

    /**
     * Database Column Remarks:
     *   删除flag
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.delete_flag
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private Boolean deleteFlag;

    /**
     * Database Column Remarks:
     *   自我介绍
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.introduction
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    private String introduction;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_type
     *
     * @return the value of user.user_type
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_type
     *
     * @param userType the value for user.user_type
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gender
     *
     * @return the value of user.gender
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gender
     *
     * @param gender the value for user.gender
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.grade
     *
     * @return the value of user.grade
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.grade
     *
     * @param grade the value for user.grade
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.interest
     *
     * @return the value of user.interest
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public String getInterest() {
        return interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.interest
     *
     * @param interest the value for user.interest
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setInterest(String interest) {
        this.interest = interest == null ? null : interest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.valid_start_time
     *
     * @return the value of user.valid_start_time
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public LocalDateTime getValidStartTime() {
        return validStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.valid_start_time
     *
     * @param validStartTime the value for user.valid_start_time
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setValidStartTime(LocalDateTime validStartTime) {
        this.validStartTime = validStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.valid_end_time
     *
     * @return the value of user.valid_end_time
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public LocalDateTime getValidEndTime() {
        return validEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.valid_end_time
     *
     * @param validEndTime the value for user.valid_end_time
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setValidEndTime(LocalDateTime validEndTime) {
        this.validEndTime = validEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_date_time
     *
     * @return the value of user.create_date_time
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_date_time
     *
     * @param createDateTime the value for user.create_date_time
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_date_time
     *
     * @return the value of user.update_date_time
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_date_time
     *
     * @param updateDateTime the value for user.update_date_time
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.delete_flag
     *
     * @return the value of user.delete_flag
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.delete_flag
     *
     * @param deleteFlag the value for user.delete_flag
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.introduction
     *
     * @return the value of user.introduction
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.introduction
     *
     * @param introduction the value for user.introduction
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", userType=").append(userType);
        sb.append(", email=").append(email);
        sb.append(", birthday=").append(birthday);
        sb.append(", gender=").append(gender);
        sb.append(", grade=").append(grade);
        sb.append(", interest=").append(interest);
        sb.append(", validStartTime=").append(validStartTime);
        sb.append(", validEndTime=").append(validEndTime);
        sb.append(", createDateTime=").append(createDateTime);
        sb.append(", updateDateTime=").append(updateDateTime);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", introduction=").append(introduction);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
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
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getInterest() == null ? other.getInterest() == null : this.getInterest().equals(other.getInterest()))
            && (this.getValidStartTime() == null ? other.getValidStartTime() == null : this.getValidStartTime().equals(other.getValidStartTime()))
            && (this.getValidEndTime() == null ? other.getValidEndTime() == null : this.getValidEndTime().equals(other.getValidEndTime()))
            && (this.getCreateDateTime() == null ? other.getCreateDateTime() == null : this.getCreateDateTime().equals(other.getCreateDateTime()))
            && (this.getUpdateDateTime() == null ? other.getUpdateDateTime() == null : this.getUpdateDateTime().equals(other.getUpdateDateTime()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Oct 12 15:14:22 CST 2021
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getInterest() == null) ? 0 : getInterest().hashCode());
        result = prime * result + ((getValidStartTime() == null) ? 0 : getValidStartTime().hashCode());
        result = prime * result + ((getValidEndTime() == null) ? 0 : getValidEndTime().hashCode());
        result = prime * result + ((getCreateDateTime() == null) ? 0 : getCreateDateTime().hashCode());
        result = prime * result + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        return result;
    }
}