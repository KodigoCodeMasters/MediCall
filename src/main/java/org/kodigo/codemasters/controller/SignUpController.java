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
import org.kodigo.codemasters.dto.UserRegistrationForm;
import org.kodigo.codemasters.exception.UserAlreadyExistAuthenticationException;
import org.kodigo.codemasters.services.MessageService;
import org.kodigo.codemasters.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 *
 * @author JoseM
 */

@Controller
public class SignUpController {
    
    private final Logger logger = LogManager.getLogger(getClass());

    @Resource
    private MessageService messageService;

    @Autowired
    private UserService userService;
    
    @GetMapping("/sign-up")
    public ModelAndView register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return new ModelAndView("sign-up", "userRegistrationForm", new UserRegistrationForm());
	}
    
    @PostMapping("/sign-up")
    public ModelAndView registerUser(@Valid UserRegistrationForm userRegistrationForm, BindingResult result, final HttpServletRequest request, RedirectAttributes attributes) {
        ModelAndView model = new ModelAndView("sign-up");
        if (!result.hasErrors()) {
            try {
                userService.registerNewUser(userRegistrationForm);
                attributes.addFlashAttribute("css", "success");
                attributes.addFlashAttribute("msg", messageService.getMessage("message.regSucc"));
                model = new ModelAndView("redirect:/login");
            } catch (UserAlreadyExistAuthenticationException e) {
                logger.error(e);
                result.rejectValue("email", "message.regError");
            }
        }
        return model;
    }
}
