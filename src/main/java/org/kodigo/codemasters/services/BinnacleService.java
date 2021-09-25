package org.kodigo.codemasters.services;

import java.util.List;
import java.util.Optional;
import org.kodigo.codemasters.dao.IBinnacleDao;
import org.kodigo.codemasters.model.Binnacle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danny
 */
@Service
public class BinnacleService implements IBinnacleService{

    @Autowired
    private IBinnacleDao dao;
    
    @Override
    public Binnacle register(Binnacle obj) {
        return dao.save(obj);
    }

    @Override
    public Binnacle update(Binnacle obj) {
        return dao.save(obj);
    }

    @Override
    public List<Binnacle> find() {
        return dao.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        dao.deleteById(id);
        return true;
    }

    @Override
    public Binnacle findById(Integer id) {
        Optional<Binnacle> op = dao.findById(id);
        return op.isPresent() ? op.get() : new Binnacle();
    }
    
}
