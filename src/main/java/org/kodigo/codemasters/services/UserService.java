package org.kodigo.codemasters.services;

import java.util.List;
import java.util.Optional;
import org.kodigo.codemasters.dao.IUsersDao;
import org.kodigo.codemasters.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danny
 */
@Service
public class UserService implements IUsersService{

    @Autowired
    private IUsersDao dao;
    
    @Override
    public Users register(Users obj) {
        return dao.save(obj);
    }

    @Override
    public Users update(Users obj) {
        return dao.save(obj);
    }

    @Override
    public List<Users> find() {
        return dao.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        dao.deleteById(id);
        return true;
    }

    @Override
    public Users findById(Integer id) {
        Optional<Users> op = dao.findById(id);
        return op.isPresent() ? op.get() : new Users();
    }
    
}
