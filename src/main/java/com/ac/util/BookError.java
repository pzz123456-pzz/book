package com.ac.util;

/**
 * @author wenqing.chen  2021/10/12 13:41
 **/
public enum BookError {
    /**
     * 错误1
     */
    ERROR_1("ab1", "用户不存在"),
    /**
     * 错误2
     */
    ERROR_2("ab2", "用户名或密码错误"),
    /**
     * 错误3
     */
    ERROR_3("ab3", "用户已过期"),

    ERROR_4("4","库存不能为负数"),

    ERROR_5("5","已经归还过了"),
    ERROR_6("6","上一本一样的书还没还，不借！");

    BookError(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;

    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
