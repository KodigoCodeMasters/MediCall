package org.kodigo.codemasters.controllers.ws;

import java.net.URI;
import java.util.List;
import org.kodigo.codemasters.model.HospitalDepartment;
import org.kodigo.codemasters.services.IHospitalDepartmentService;
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
@RequestMapping("/hospitals")
public class HospitalController {
    
    @Autowired
    private IHospitalDepartmentService service;
    
    @PostMapping
    public ResponseEntity<HospitalDepartment> register(@RequestBody HospitalDepartment hospital){
        HospitalDepartment h = service.register(hospital);
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(h.getIdHospital()).toUri();
        
        return ResponseEntity.created(uri).build();
    }
    
    @PutMapping
    public ResponseEntity<HospitalDepartment> update(@RequestBody HospitalDepartment hospital){
        HospitalDepartment h = service.register(hospital);
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(h.getIdHospital()).toUri();
        
        return ResponseEntity.created(uri).build();
    }
    
    @GetMapping
    public ResponseEntity<List<HospitalDepartment>> find(){
        List<HospitalDepartment> list = service.find();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id){
        HospitalDepartment h = service.findById(id);
        service.delete(id);
        return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
    }
    
}
