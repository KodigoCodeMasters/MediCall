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
 * @author Néstor Recinos
 */
@Controller
public class PatientController {
    @RequestMapping("/patient_menu")
    public String patientmenu(){
        return "patientMenu";
    }
    
    
}
