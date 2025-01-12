package com.example.PP_3_1_3_Bootstrap.controller;

import com.example.PP_3_1_3_Bootstrap.model.User;
import com.example.PP_3_1_3_Bootstrap.service.UserServiceImp;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class AdminController {

    private final UserServiceImp userService;

    public AdminController(UserServiceImp userService) {
        this.userService = userService;
    }

    @GetMapping( "/admin")
    public String printUser(Authentication authentication, ModelMap model) {
        model.addAttribute( "user", authentication.getPrincipal());
        model.addAttribute("usersList", userService.getAllUsers());
        model.addAttribute("newUser", new User());
        return "admin";
    }

    @PostMapping("/admin/addNewUser")
    public String addUser(@ModelAttribute("newUser") @Valid User user) {
        userService.saveUser(user);
        return "redirect:/admin";
    }

    @DeleteMapping("/delete")
    public String deleteUser(@RequestParam("id") long id) {
        userService.deleteUser(id);
        return "redirect:/admin";
    }

    @PostMapping("/admin/edit")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/admin";
    }
}
