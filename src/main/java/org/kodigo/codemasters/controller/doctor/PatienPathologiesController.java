/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.controller.doctor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Néstor Recinos
 */
@Controller
public class PatienPathologiesController {
    @RequestMapping("/patient/pathologies")
    public String patient_pathologies(Model model){
        model.addAttribute("pathologies");
        return "doctor/pathologies_patient";
    }
}
