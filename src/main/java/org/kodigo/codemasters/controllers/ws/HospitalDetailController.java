/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.controllers.ws;

import java.net.URI;
import java.util.List;
import org.kodigo.codemasters.model.HospitalDetail;
import org.kodigo.codemasters.model.HospitalDetail;
import org.kodigo.codemasters.services.IHospitalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author Danny
 */

@RestController
@RequestMapping("/hospitalDetails")
public class HospitalDetailController {
    
    @Autowired
    private IHospitalDetailsService service;
    
    @PostMapping
    public ResponseEntity<HospitalDetail> register(@RequestBody HospitalDetail hospital){
        HospitalDetail h = service.register(hospital);
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(h.getIdHospitalDetails()).toUri();
        
        return ResponseEntity.created(uri).build();
    }
    
    @PutMapping
    public ResponseEntity<HospitalDetail> update(@RequestBody HospitalDetail hospital){
        HospitalDetail h = service.register(hospital);
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(h.getIdHospitalDetails()).toUri();
        
        return ResponseEntity.created(uri).build();
    }
    
    @GetMapping
    public ResponseEntity<List<HospitalDetail>> find(){
        List<HospitalDetail> list = service.find();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id){
        HospitalDetail h = service.findById(id);
        service.delete(id);
        return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
    }
    
    
}
