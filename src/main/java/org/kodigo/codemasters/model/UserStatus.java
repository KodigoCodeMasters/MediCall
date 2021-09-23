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
@Table(name = "user_status")
public class UserStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_status")
    private Integer idUserStatus;
    
    @Column(name = "user_status")
    private String userStatus;
    
    @OneToMany(mappedBy = "idUserStatus")
    private List<Users> usersList;

    public UserStatus() {
    }

    public UserStatus(Integer idUserStatus) {
        this.idUserStatus = idUserStatus;
    }

    public UserStatus(Integer idUserStatus, String userStatus) {
        this.idUserStatus = idUserStatus;
        this.userStatus = userStatus;
    }

    public Integer getIdUserStatus() {
        return idUserStatus;
    }

    public void setIdUserStatus(Integer idUserStatus) {
        this.idUserStatus = idUserStatus;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }
}
