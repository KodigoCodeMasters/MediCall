package org.kodigo.codemasters.services;

import java.util.List;
import java.util.Optional;
import org.kodigo.codemasters.dao.IHospitalDepartmentDao;
import org.kodigo.codemasters.model.HospitalDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danny
 */
@Service
public class HospitalDepartmentService implements IHospitalDepartmentService{

    @Autowired
    private IHospitalDepartmentDao dao;
    
    @Override
    public HospitalDepartment register(HospitalDepartment hospital) {
        return dao.save(hospital);
    }

    @Override
    public HospitalDepartment update(HospitalDepartment hospital) {
        return dao.save(hospital);
    }

    @Override
    public List<HospitalDepartment> find() {
        return dao.findAll();
    }

    @Override
    public HospitalDepartment findById(Integer id) {
        Optional<HospitalDepartment> op =dao.findById(id);
        return op.isPresent() ? op.get() : new HospitalDepartment();
    }

    @Override
    public boolean delete(Integer id) {
        dao.deleteById(id);
        return true;
    }
    
}
