package com.ac.util;

import lombok.Data;

/**
 * @author wenqing.chen  2021/10/12 13:36
 **/
@Data
public class ResponseResult {

    /**
     * 返回码
     * 1 成功
     * 2 错误
     * 3 其他
     */
    private String code;

    /**
     * 返回数据
     */
    private Object data;

    /**
     * 错误信息
     */
    private String msg;
}
