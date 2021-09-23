/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Danny
 */
@Entity
@Table(name = "query")
public class Query implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_query")
    private Integer idQuery;
    
    @Column(name = "hieght")
    private String hieght;
    
    @Column(name = "weight")
    private String weight;
    
    @Column(name = "observations")
    private String observations;
    
    @Column(name = "date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    
    @JoinColumn(name = "id_patient", referencedColumnName = "id_patient")
    @ManyToOne
    private Patient idPatient;

    public Query() {
    }

    public Query(Integer idQuery) {
        this.idQuery = idQuery;
    }

    public Query(Integer idQuery, String hieght, String weight, String observations) {
        this.idQuery = idQuery;
        this.hieght = hieght;
        this.weight = weight;
        this.observations = observations;
    }

    public Integer getIdQuery() {
        return idQuery;
    }

    public void setIdQuery(Integer idQuery) {
        this.idQuery = idQuery;
    }

    public String getHieght() {
        return hieght;
    }

    public void setHieght(String hieght) {
        this.hieght = hieght;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Patient getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Patient idPatient) {
        this.idPatient = idPatient;
    }

}
