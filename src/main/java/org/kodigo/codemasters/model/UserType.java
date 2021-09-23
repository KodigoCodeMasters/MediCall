/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Danny
 */
@Entity
@Table(name = "user_type")
public class UserType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_type")
    private Integer idUserType;
    
    @Column(name = "user_type")
    private String userType;
    
    @OneToMany(mappedBy = "idUserType")
    private List<Users> usersList;

    public UserType() {
    }

    public UserType(Integer idUserType) {
        this.idUserType = idUserType;
    }

    public UserType(Integer idUserType, String userType) {
        this.idUserType = idUserType;
        this.userType = userType;
    }

    public Integer getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(Integer idUserType) {
        this.idUserType = idUserType;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }
}
