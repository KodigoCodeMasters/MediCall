/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.services;

import java.util.List;
import java.util.Optional;
import org.kodigo.codemasters.dao.IHospitalDetailsDao;
import org.kodigo.codemasters.model.HospitalDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danny
 */
@Service
public class HospitalDetailsService implements IHospitalDetailsService{
    
    @Autowired
    private IHospitalDetailsDao dao;

    @Override
    public HospitalDetail register(HospitalDetail hdetails) {
        return dao.save(hdetails);
    }

    @Override
    public HospitalDetail update(HospitalDetail hdetails) {
        return dao.save(hdetails);
    }

    @Override
    public List<HospitalDetail> find() {
        return dao.findAll();
    }

    @Override
    public HospitalDetail findById(Integer id) {
        Optional<HospitalDetail> op =dao.findById(id);
        return op.isPresent() ? op.get() : new HospitalDetail();
    }

    @Override
    public boolean delete(Integer id) {
        dao.deleteById(id);
        return true;
    }
    
}
