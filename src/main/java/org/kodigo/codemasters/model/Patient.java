/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
    
    @Lob
    @Column(name = "patient_profile")
    private byte[] patientProfile;
    
    @Column(name = "names")
    private String names;
    
    @Column(name = "last_names")
    private String lastNames;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "users")
    private String users;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "pregnancy")
    private String pregnancy;
    
    @Column(name = "date_birth")
    @Temporal(TemporalType.DATE)
    private Date dateBirth;
    
    @Column(name = "registration_date")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;
    
    @Column(name = "patient_status")
    private Character patientStatus;

    public Patient() {
    }

    public Patient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    public Patient(Integer idPatient, String names, String lastNames, String gender, String users, String password, String email, String pregnancy, Date dateBirth, Date registrationDate, Character patientStatus) {
        this.idPatient = idPatient;
        this.names = names;
        this.lastNames = lastNames;
        this.gender = gender;
        this.users = users;
        this.password = password;
        this.email = email;
        this.pregnancy = pregnancy;
        this.dateBirth = dateBirth;
        this.registrationDate = registrationDate;
        this.patientStatus = patientStatus;
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

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Character getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(Character patientStatus) {
        this.patientStatus = patientStatus;
    }

   
}
