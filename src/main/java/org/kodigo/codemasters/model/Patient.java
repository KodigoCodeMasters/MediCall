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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Danny
 */
@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    private Integer idPatient;
    
    @Column(name = "date_birth")
    @Temporal(TemporalType.DATE)
    private Date dateBirth;
        
    @Column(name = "gender")
    private String gender;
    
    @Lob
    @Column(name = "patient_profile")
    private byte[] patientProfile;
    
    @Column(name = "pregnancy")
    private String pregnancy;
    
    @JoinColumn(name ="user_id", referencedColumnName = "user_id")
    @ManyToOne
    private User userId;
    

    public Patient() {
    }

    public Patient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    public Patient(Integer idPatient, byte[] patientProfile, String gender, String pregnancy, Date dateBirth) {
        this.idPatient = idPatient;
        this.patientProfile = patientProfile;
        this.gender = gender;
        this.pregnancy = pregnancy;
        this.dateBirth = dateBirth;
    }

    public Integer getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    public byte[] getPatientProfile() {
        return patientProfile;
    }

    public void setPatientProfile(byte[] patientProfile) {
        this.patientProfile = patientProfile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(String pregnancy) {
        this.pregnancy = pregnancy;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

}
