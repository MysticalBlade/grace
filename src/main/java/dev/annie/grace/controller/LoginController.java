package dev.annie.grace.controller;


import dev.annie.grace.data.Users;
import dev.annie.grace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.List;


@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/userForm")
    public ModelAndView showForm() {
        return new ModelAndView("userForm", "user", new Users());
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") Users user) {
        LocalDateTime now = LocalDateTime.now();
        user.setCreatedAt(now);
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/")
    public String viewUsers(Model model) {
        List<Users> listUsers = userService.getAllUsers();
        model.addAttribute("listUsers", listUsers);
        return "index";
    }

    @GetMapping("/editUser/{id}")
    public ModelAndView showEditUserForm(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("editUser");
        Users user = userService.getUserById(id);
        mav.addObject("user", user);
        return mav;
    }

    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute("user") Users user) {
        LocalDateTime now = LocalDateTime.now();
        userService.updateUser(user);
        return "redirect:/";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable(name = "id") Long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}