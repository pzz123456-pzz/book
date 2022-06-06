package com.ac.filter;

import com.ac.exception.BookException;
import com.ac.util.ResponseResult;
import com.ac.util.ResponseResultUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author wenqing.chen  2021/10/12 14:07
 **/
@WebFilter
public class ExceptionHandlerFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            filterChain.doFilter(request, response);
        } catch (Exception e) {
            e.printStackTrace();

            String message;
            if (e.getCause() instanceof ConstraintViolationException) {
                ConstraintViolationException constraintViolationException = (ConstraintViolationException) e.getCause();
                Set<ConstraintViolation<?>> constraintViolations = constraintViolationException.getConstraintViolations();
                List<String> messages = new ArrayList<>();
                for (ConstraintViolation<?> violation : constraintViolations) {
                    Path propertyPath = violation.getPropertyPath();
                    String[] pathArr = StringUtils.splitByWholeSeparatorPreserveAllTokens(propertyPath.toString(), ".");
                    messages.add(pathArr[1] + violation.getMessage());
                }
                message = StringUtils.join(messages, ";");
            } else if (e.getCause() instanceof BookException) {
                BookException bookException = (BookException) e.getCause();
                Errors errors = bookException.getErrors();
                List<FieldError> fieldErrors = errors.getFieldErrors();
                List<String> messages = new ArrayList<>();
                for (FieldError fieldError : fieldErrors) {
                    messages.add(fieldError.getField() + fieldError.getDefaultMessage());
                }
                message = StringUtils.join(messages, ";");
            } else {
                message = e.getMessage();
            }
            ResponseResult responseResult = ResponseResultUtil.fail(message);
            ObjectMapper objectMapper = new ObjectMapper();
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            response.setCharacterEncoding(Charset.defaultCharset().name());
            response.getWriter().write(objectMapper.writeValueAsString(responseResult));
        }
    }
}
