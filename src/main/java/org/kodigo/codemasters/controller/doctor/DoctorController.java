/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.controller.doctor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Néstor Recinos
 */
@Controller
public class DoctorController {
    @RequestMapping("/doctor/medical-details")
    public String medicaldetails(){
        return "doctor/medical-details";
    }
    
    @RequestMapping("/doctor/doctor-menu")
    public String doctorMenu(){
        return "doctor/doctor-menu";
    }
    
    @RequestMapping("/doctor/patient")
    public String Patient(){
        return "doctor/patient";
    }
    
    @RequestMapping("/doctor/pathologies-patient")
    public String patientPathologies(){
        return "doctor/pathologies-patient";
    }
    
    @RequestMapping("/doctor/view-appointment")
    public String viewPathologies(){
        return "doctor/view-appointment";
    }
    
}
