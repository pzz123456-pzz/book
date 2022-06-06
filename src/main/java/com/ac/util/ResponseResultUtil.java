package com.ac.util;

/**
 * @author wenqing.chen  2021/10/12 13:38
 **/
public class ResponseResultUtil {

    public static ResponseResult success(Object data) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode("1");
        responseResult.setData(data);
        return responseResult;
    }

    public static ResponseResult fail(String msg) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode("2");
        responseResult.setMsg(msg);
        return responseResult;
    }

    public static ResponseResult fail(BookError bookError) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(bookError.getCode());
        responseResult.setMsg(bookError.getMsg());
        return responseResult;
    }
}
