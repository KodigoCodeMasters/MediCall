/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.controllers.ws;

import java.net.URI;
import java.util.List;
import org.kodigo.codemasters.model.PatientPathologies;
import org.kodigo.codemasters.services.IPatientPathologiesService;
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
 * @author miner
 */
@RestController
@RequestMapping("/patientPathologies")
public class PatientPathologiesWebService {
    
    @Autowired
    private IPatientPathologiesService service;
    
    @PostMapping
    public ResponseEntity<PatientPathologies> register(@RequestBody PatientPathologies patient){
        PatientPathologies p = service.register(patient);
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getIdPatientPathologies()).toUri();
        
        return ResponseEntity.created(uri).build();
    }
    
    @PutMapping
    public ResponseEntity<PatientPathologies> update(@RequestBody PatientPathologies patient){
        PatientPathologies p = service.register(patient);
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getIdPatientPathologies()).toUri();
        
        return ResponseEntity.created(uri).build();
    }
    
    @GetMapping
    public ResponseEntity<List<PatientPathologies>> find(){
        List<PatientPathologies> list = service.find();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id){
        PatientPathologies p = service.findById(id);
        service.delete(id);
        return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
    }
}
