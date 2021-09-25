package org.kodigo.codemasters.services;

import java.util.List;
import java.util.Optional;
import org.kodigo.codemasters.dao.IPatientDao;
import org.kodigo.codemasters.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danny
 */
@Service
public class PatientService implements IPatientService{

    @Autowired
    private IPatientDao dao;
    
    @Override
    public Patient register(Patient obj) {
        return dao.save(obj);
    }

    @Override
    public Patient update(Patient obj) {
        return dao.save(obj);
    }

    @Override
    public List<Patient> find() {
        return dao.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        dao.deleteById(id);
        return true;
    }

    @Override
    public Patient findById(Integer id) {
        Optional<Patient> op = dao.findById(id);
        return op.isPresent() ? op.get() : new Patient();
    }
    
}
