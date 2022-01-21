package com.haozai.plasma.cms.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @RequestMapping("testController")
    public String testController() {
        return "Hello !";
    }

}
