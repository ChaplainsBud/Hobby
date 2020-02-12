package com.matthew.hobby;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
    @RequestMapping("/")
    public String page2() {
        return "page2";
    }
    @RequestMapping("/")
    public String page3() {
        return "page3";
    }
    @RequestMapping("/")
    public String page4() {
        return "page4";
    }
    @RequestMapping("/")
    public String page5() {
        return "page5";
    }
}
