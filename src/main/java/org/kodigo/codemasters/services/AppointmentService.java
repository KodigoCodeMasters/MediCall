package org.kodigo.codemasters.services;

import java.util.List;
import java.util.Optional;
import org.kodigo.codemasters.dao.IAppointmentDao;
import org.kodigo.codemasters.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author Danny
 */
@Service
public class AppointmentService implements IAppointmentService{

    @Autowired
    private IAppointmentDao dao;
    
    @Override
    public Appointment register(Appointment obj) {
        return dao.save(obj);
    }

    @Override
    public Appointment update(Appointment obj) {
        return dao.save(obj);
    }

    @Override
    public List<Appointment> find() {
        return dao.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        dao.deleteById(id);
        return true;
    }

    @Override
    public Appointment findById(Integer id) {
        Optional<Appointment> op = dao.findById(id);
        return op.isPresent() ? op.get() : new Appointment();
    }
    
}
