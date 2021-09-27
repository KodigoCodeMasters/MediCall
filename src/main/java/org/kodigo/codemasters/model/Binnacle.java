/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Danny
 */
@Entity
@Table(name = "binnacle")
public class Binnacle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name = "id_mov")
    private Integer idMov;
    
    @Column(name = "users")
    private String users;
   
    @Column(name = "date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
   
    @Column(name = "movement_type")
    private String movementType;

    public Binnacle() {
    }

    public Binnacle(Integer idMov) {
        this.idMov = idMov;
    }

    public Binnacle(Integer idMov, String users, Date dateTime, String movementType) {
        this.idMov = idMov;
        this.users = users;
        this.dateTime = dateTime;
        this.movementType = movementType;
    }

    public Integer getIdMov() {
        return idMov;
    }

    public void setIdMov(Integer idMov) {
        this.idMov = idMov;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

}
