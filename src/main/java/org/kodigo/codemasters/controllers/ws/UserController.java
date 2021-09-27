/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.controllers.ws;

import java.net.URI;
import java.util.List;
import org.kodigo.codemasters.model.User;
import org.kodigo.codemasters.services.IUserService;
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
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private IUserService service;
    
    @PostMapping
    public ResponseEntity<User> register(@RequestBody User user){
        User u = service.register(user);
                
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(u.getId()).toUri();
        
        return ResponseEntity.created(uri).build();
    }
    
    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user){
        User u = service.register(user);
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(u.getId()).toUri();
        
        return ResponseEntity.created(uri).build();
    }
    
    @GetMapping
    public ResponseEntity<List<User>> find(){
        List<User> list = service.find();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id){
        User u = service.findById(id);
        service.delete(id);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }
}
