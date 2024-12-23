package com.vaccination.vaccinate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.vaccination.vaccinate.Model.Modeluser;
import com.vaccination.vaccinate.Serivce.Userservice;
@Controller
public class Usercontrol {

    @Autowired
    Userservice server;

    @GetMapping("/")
    public String home(Model mod) {
        List<Modeluser> use = server.findAll();
        mod.addAttribute("data", use);
        return "index";  // Home page
    }

    @GetMapping("/Welcome")
    public String showRegisterPage(@ModelAttribute Modeluser user, Model model) {
        return "register";  // Register page
    }

    @PostMapping("/all")
    public String add(@ModelAttribute Modeluser user, Model mod) {
        server.Add(user);
        return "redirect:/";  // Redirect to home after successful registration
    }

}
