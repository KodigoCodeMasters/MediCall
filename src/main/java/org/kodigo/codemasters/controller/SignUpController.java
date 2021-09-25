/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author JoseM
 */

@Controller
public class SignUpController {
    
    @RequestMapping("/sign-up")
    public String signup() {
        return "sign-up";
    }
}
