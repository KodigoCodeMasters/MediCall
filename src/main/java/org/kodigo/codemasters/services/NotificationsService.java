package org.kodigo.codemasters.services;

import java.util.List;
import java.util.Optional;
import org.kodigo.codemasters.dao.INotificationsDao;
import org.kodigo.codemasters.model.Notifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danny
 */
@Service
public class NotificationsService implements INotificationsService{

    @Autowired
    private INotificationsDao dao;
    
    @Override
    public Notifications register(Notifications obj) {
        return dao.save(obj);
    }

    @Override
    public Notifications update(Notifications obj) {
        return dao.save(obj);
    }

    @Override
    public List<Notifications> find() {
        return dao.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        dao.deleteById(id);
        return true;
    }

    @Override
    public Notifications findById(Integer id) {
        Optional<Notifications> op = dao.findById(id);
        return op.isPresent() ? op.get() : new Notifications();
    }
    
}
