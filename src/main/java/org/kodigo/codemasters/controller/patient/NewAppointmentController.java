/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.controller.patient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Néstor Recinos
 */
@Controller
public class NewAppointmentController {
    @RequestMapping("/patient/new-appointment")
    public String newappointment(){
        return "/patient/new-appointment";
    }
}
