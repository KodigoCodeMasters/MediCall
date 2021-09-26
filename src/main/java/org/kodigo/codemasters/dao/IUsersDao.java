package org.kodigo.codemasters.dao;

import org.kodigo.codemasters.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Danny
 */
@Repository
public interface IUsersDao extends JpaRepository<User, Integer>{
    
}
