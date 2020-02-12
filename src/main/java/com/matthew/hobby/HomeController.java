package com.matthew.hobby;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
    @RequestMapping("/hamsun")
    public String page2() {
        return "page2";
    }
    @RequestMapping("/undset")
    public String page3() {
        return "page3";
    }
    @RequestMapping("/knausgaard")
    public String page4() {
        return "page4";
    }
    @RequestMapping("/ibsen")
    public String page5() {
        return "page5";
    }
    @RequestMapping("/timeline")
    public String page6() {
        return "timeline";
    }
}
