package org.kodigo.codemasters.dao;

import org.kodigo.codemasters.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Danny
 */
@Repository
public interface IAppointmentDao extends JpaRepository<Appointment, Integer>{
    
}
