/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JoseM
 */

@Controller
public class IndexAdminController {
    
    @GetMapping("/admin/admin-menu")
    public ModelAndView home(@RequestParam(value = "view", required = false) String view){
        ModelAndView model = new ModelAndView("admin/admin-menu");
        model.addObject("title", "Medi-Call Administration Panel");
        model.addObject("view", view);
        return model;
    }
}
