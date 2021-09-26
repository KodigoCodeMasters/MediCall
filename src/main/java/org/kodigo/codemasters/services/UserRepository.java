/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.services;

import org.kodigo.codemasters.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Danny
 */
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
    boolean existsByEmail(String email);
}
