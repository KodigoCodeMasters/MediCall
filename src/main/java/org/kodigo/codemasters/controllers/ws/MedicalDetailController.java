/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.controllers.ws;

import java.net.URI;
import java.util.List;
import org.kodigo.codemasters.model.MedicalDetail;
import org.kodigo.codemasters.services.IMedicalDetail;
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
 * @author JoseM
 */
@RestController
@RequestMapping("/medicaldetail")
public class MedicalDetailController {
    @Autowired
    private IMedicalDetail service;
    
    @PostMapping
    public ResponseEntity<MedicalDetail> register(@RequestBody MedicalDetail medicalDetail){
        MedicalDetail p = service.register(medicalDetail);
        
        //Retorna la uri del recurso creado
        //Ej. localhost:8081/pathologies/1
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getIdMedicalDetail()).toUri();
        
        return ResponseEntity.created(uri).build();
    }
    
    @PutMapping
    public ResponseEntity<MedicalDetail> update(@RequestBody MedicalDetail medicalDetail){
        MedicalDetail p = service.register(medicalDetail);
        
        //Retorna la url del recurso creado
        //Ej. localhost:8081/pathologies/1
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getIdMedicalDetail()).toUri();
        
        return ResponseEntity.created(uri).build();
    }
    
    @GetMapping
    public ResponseEntity<List<MedicalDetail>> find(){
        List<MedicalDetail> list = service.find();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id){
        MedicalDetail p = service.findById(id);
        service.delete(id);
        return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
    }
}
