/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.services;

import java.util.List;
import org.kodigo.codemasters.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Danny
 */
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
    boolean existsByEmail(String email);
    List<User> findAll();
    
    @Query("SELECT u FROM User u INNER JOIN u.roles r")
    List<User> findAllWithRoles();
}
