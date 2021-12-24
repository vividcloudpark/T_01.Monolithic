package com.samsung.Mono.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.net.InetAddress;
import java.net.UnknownHostException;


@Controller
public class IndexController {

    @RequestMapping("/")
    public String indexView(Model model){
        InetAddress serverip;
        String hostname;
        try {
            serverip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            model.addAttribute("serverIP", serverip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        
        
        HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		String ip = req.getHeader("X-FORWARDED-FOR");
		if (ip == null)
			ip = req.getRemoteAddr();
		model.addAttribute("clientIp", ip);
        return "index.html";
    }



}
