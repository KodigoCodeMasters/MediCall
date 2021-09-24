package org.kodigo.codemasters.dao;

import org.kodigo.codemasters.model.Pathologies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Danny
 */
@Repository
public interface IPathologiesDao extends JpaRepository<Pathologies, Integer>{
    
}
