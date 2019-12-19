package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class TestController
{
    @RequestMapping("/test")
    @ResponseBody
    public String testDemo()
    {
        return "ccw's first bloood!";
    }
}
