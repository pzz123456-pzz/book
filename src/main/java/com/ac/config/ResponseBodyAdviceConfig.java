package com.ac.config;

import com.ac.util.ResponseResult;
import com.ac.util.ResponseResultUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author wenqing.chen  2021/10/12 13:48
 **/
@RestControllerAdvice
public class ResponseBodyAdviceConfig implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        ResponseResult responseResult;
        if (o instanceof ResponseResult) {
            responseResult = (ResponseResult) o;
        } else {
            responseResult = ResponseResultUtil.success(o);
        }
        if (o instanceof String) {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(responseResult);
        } else {
            return responseResult;
        }
    }

}
