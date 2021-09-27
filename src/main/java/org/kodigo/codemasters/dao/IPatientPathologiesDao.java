/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.dao;

import org.kodigo.codemasters.model.PatientPathologies;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author miner
 */
public interface IPatientPathologiesDao  extends JpaRepository<PatientPathologies, Integer> {
    
}
