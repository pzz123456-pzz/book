package com.ac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wenqing.chen  2021/10/12 19:21
 **/
@Controller
public class PageController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
