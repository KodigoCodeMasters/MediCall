/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.services;

import org.kodigo.codemasters.model.PatientPathologies;
import org.springframework.stereotype.Repository;

/**
 *
 * @author miner
 */
@Repository
public interface IPatientPathologiesService extends ICRUD<PatientPathologies, Integer>{
    
}
