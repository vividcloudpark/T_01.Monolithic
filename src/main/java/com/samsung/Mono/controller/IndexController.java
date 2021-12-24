package com.samsung.Mono.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import java.net.InetAddress;
import java.net.UnknownHostException;


@Controller
public class IndexController {

    @RequestMapping("/")
    public String indexView(Model model){
        InetAddress serverip;
        try {
            serverip = InetAddress.getLocalHost();
            model.addAttribute("serverip", serverip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return "index.html";
    }



}
