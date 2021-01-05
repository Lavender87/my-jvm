package com.laven.learning.myjvm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class MyDockerController {

    @GetMapping("/mydocker/{msg}")
    public String demo(@PathVariable String msg) {
        return "hi first docker show111 ! "+msg;
    }

    @GetMapping("/k8s")
    public String demok8s() {
        String msg="";
        try {
            InetAddress address = InetAddress.getLocalHost();
            msg = "hosname"+address.getHostName()+",hostaddress:"+address.getHostAddress();
            System.out.println();
            System.out.println();
            System.out.println();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return "hello k8s!<br/> "+msg;
    }
}
