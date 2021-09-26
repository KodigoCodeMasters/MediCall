/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.services;

import org.kodigo.codemasters.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JoseM
 */
   
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
