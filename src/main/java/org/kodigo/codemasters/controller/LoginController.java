/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.kodigo.codemasters.dto.UserRegistrationForm;
import org.kodigo.codemasters.exception.UserAlreadyExistAuthenticationException;
import org.kodigo.codemasters.services.MessageService;
import org.kodigo.codemasters.services.UserService;
/**
 *
 * @author JoseM
 */

@RestController
public class LoginController {
    
    private final Logger logger = LogManager.getLogger(getClass());

    @Resource
    private MessageService messageService;

    @Autowired
    private UserService userService;
    
    @GetMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout, @RequestParam(value = "errorCode", required = false) String errorCode)
            throws ServletException, IOException {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("css", "danger");
            model.addObject("msg", error);
        } else if (logout != null) {
            model.addObject("css", "success");
            model.addObject("msg", messageService.getMessage("message.logout." + logout));
        }
        model.addObject("title", "Login Page");
        model.setViewName("login");
        return model;
    }
}
