package com.webchat.controller;

import com.webchat.model.CoSo;
import com.webchat.service.CoSoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author huynq
 */
@Controller
@RequestMapping("/web-chat")
public class haha {

    @Autowired
    private CoSoService coSoService;
    @GetMapping("/login")
    public String viewLoginPage(Model model) {
        List<String> listCoSo = coSoService.listCoSo();
        model.addAttribute("listCoSo", listCoSo);
        return "login";
    }

    @GetMapping("/trang-chu")
    public String get() {
        return "test";
    }
}
