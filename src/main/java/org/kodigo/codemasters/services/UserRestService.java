/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.services;

import java.util.List;
import java.util.Optional;
import org.kodigo.codemasters.dao.IUsersDao;
import org.kodigo.codemasters.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author JoseM
 */
@Service
public class UserRestService implements IUserService{
    
    @Autowired
    private IUsersDao dao;
    
    @Override
    public User register(User obj){
        return dao.save(obj);
    }
    
    @Override
    public User update(User obj) {
        return dao.save(obj);
    }

    @Override
    public List<User> find() {
        return dao.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        dao.deleteById(id);
        return true;
    }

    @Override
    public User findById(Integer id) {
        Optional<User> op = dao.findById(id);
        return op.isPresent() ? op.get() : new User();
    }
    
}
