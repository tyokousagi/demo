package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class userForm {

    @GetMapping("/userForm")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "result";
    }

}
