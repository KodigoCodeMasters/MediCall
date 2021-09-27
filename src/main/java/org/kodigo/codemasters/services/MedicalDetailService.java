/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.services;

import java.util.List;
import java.util.Optional;
import org.kodigo.codemasters.dao.IMedicalDetalDao;
import org.kodigo.codemasters.model.MedicalDetail;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author JoseM
 */

@Service
public class MedicalDetailService implements IMedicalDetail{

    @Autowired
    private IMedicalDetalDao dao;
    
    @Override
    public MedicalDetail register(MedicalDetail obj) {
        return dao.save(obj);
    }

    @Override
    public MedicalDetail update(MedicalDetail obj) {
        return dao.save(obj);
    }

    @Override
    public List<MedicalDetail> find() {
        return dao.findAll();
    }

    @Override
    public MedicalDetail findById(Integer id) {
        Optional<MedicalDetail> op = dao.findById(id);
        return op.isPresent() ? op.get() : new MedicalDetail();
    }

    @Override
    public boolean delete(Integer id) {
        dao.deleteById(id);
        return true;
    }
    
}
