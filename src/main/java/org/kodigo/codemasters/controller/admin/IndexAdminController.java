/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.controller.admin;

import org.kodigo.codemasters.services.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JoseM
 */

@Controller
public class IndexAdminController {
    
    private final UserRepository userRepository;

    public IndexAdminController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    
    
    @GetMapping("/admin/admin-menu")
    public ModelAndView home(@RequestParam(value = "view", required = false) String view){
        ModelAndView model = new ModelAndView("admin/admin-menu");
        model.addObject("title", "Medi-Call Administration Panel");
        model.addObject("view", view);
        return model;

    }
    
    @GetMapping("/admin/users")
    public String user(Model model){
        model.addAttribute("users", userRepository.findAllWithRoles());
        return "admin/users";
    }
           
    @RequestMapping("/admin/hospital_details")
    public ModelAndView hospitalDetails(@RequestParam(value = "view", required = false) String view){
        ModelAndView model = new ModelAndView("admin/hospital_details");
        return model;
    }
    
    @RequestMapping("/admin/hospital_department")
    public String hospitaldepartment(){
        return "admin/hospital_department";
    }
    
    @RequestMapping("/admin/medical-details")
    public String medicaldetails(){
        return "admin/medical-details";
    }
}
