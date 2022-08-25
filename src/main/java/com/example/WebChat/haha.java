package com.example.WebChat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huynq
 */
@Controller
@RequestMapping("/test")
public class haha {
    @GetMapping()
    public String get() {

        return "test";
    }
}
