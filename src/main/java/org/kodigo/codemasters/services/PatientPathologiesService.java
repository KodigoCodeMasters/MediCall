/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.services;

import java.util.List;
import java.util.Optional;
import org.kodigo.codemasters.dao.IPatientPathologiesDao;
import org.kodigo.codemasters.model.PatientPathologies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author miner
 */
@Service
public class PatientPathologiesService implements IPatientPathologiesService{
    
    @Autowired
    private IPatientPathologiesDao dao;
    
    @Override
    public PatientPathologies register(PatientPathologies obj) {
        return dao.save(obj);
    }

    @Override
    public PatientPathologies update(PatientPathologies obj) {
        return dao.save(obj);
    }

    @Override
    public List<PatientPathologies> find() {
        return dao.findAll();
    }

    @Override
    public PatientPathologies findById(Integer id) {
        Optional<PatientPathologies> op = dao.findById(id);
        return op.isPresent() ? op.get() : new PatientPathologies();
    }

    @Override
    public boolean delete(Integer id) {
        dao.deleteById(id);
        return true;
    }
    
}
