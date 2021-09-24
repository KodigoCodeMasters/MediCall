package org.kodigo.codemasters.services;

import java.util.List;
import java.util.Optional;
import org.kodigo.codemasters.dao.IPathologiesDao;
import org.kodigo.codemasters.model.Pathologies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danny
 */
@Service
public class PathologiesService implements IPathologiesService{

    @Autowired
    private IPathologiesDao dao;
    
    @Override
    public Pathologies register(Pathologies obj) {
        return dao.save(obj);
    }

    @Override
    public Pathologies update(Pathologies obj) {
        return dao.save(obj);
    }

    @Override
    public List<Pathologies> find() {
        return dao.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        dao.deleteById(id);
        return true;
    }

    @Override
    public Pathologies findById(Integer id) {
        Optional<Pathologies> op = dao.findById(id);
        return op.isPresent() ? op.get() : new Pathologies();
    }
    
}
