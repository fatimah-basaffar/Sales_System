package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Registration
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        userService.registerUser(user);
        return "redirect:/users/login";
    }

    // Login
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
        Optional<User> user = userService.findByEmail(email);
        if (user.isPresent() && password.equals(user.get().getPasswordHash())) {
            return "redirect:/users/profile/" + user.get().getUserId();
        } else {
            model.addAttribute("error", "Invalid Email or Password");
            return "login";
        }
    }

    // Profile
    @GetMapping("/profile/{id}")
    public String showProfile(@PathVariable Integer id, Model model) {
        Optional<User> user = userService.getUserById(id);
        user.ifPresent(value -> model.addAttribute("user", value));
        return "profile";
    }

    @PostMapping("/profile/{id}")
    public String updateProfile(@ModelAttribute User user) {
        userService.updateUser(user);
        return "redirect:/users/profile/" + user.getUserId();
    }
}
