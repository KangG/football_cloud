package com.jane.football.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping(value = "/test.do")
    public String openBoardWrite() {

        return "test";

    }

}
