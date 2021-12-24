package com.samsung.Mono.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.net.InetAddress;
import java.net.UnknownHostException;


@Controller
public class IndexController {

    @RequestMapping("/")
    public String indexView(Model model){
        String serverip;
        try {
            serverip = InetAddress.getLocalHost().getHostName();
            model.addAttribute("serverip", serverip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "index.html";
    }



}
