package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.model.SignUpForm;


@Controller
public class SignUpController {

  
    @ModelAttribute("signUpForm")
    public SignUpForm setSignUpForm() {
        return new SignUpForm();
    }

    
    @GetMapping("/showSignUpForm")
    public String showForm() {
        return "signup-form";
    }

 
    @PostMapping("/saveSignUpForm")
    public String saveUser(@ModelAttribute("signUp-Form") SignUpForm signUpForm, Model model) {

        System.out.println(signUpForm.getFirstName());
        System.out.println(signUpForm.getLastName());
        System.out.println(signUpForm.getUserName());
        System.out.println(signUpForm.getPassword());
        System.out.println(signUpForm.getEmail());
   


        model.addAttribute("message", "User SignUp successfully.");
        model.addAttribute("user", signUpForm);

        return "signup-success";
    }
}