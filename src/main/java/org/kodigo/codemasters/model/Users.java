/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Danny
 */
@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer idUser;
    
    @Lob
    @Column(name = "user_profile")
    private byte[] userProfile;
    
    @Column(name = "names")
    private String names;
    
    @Column(name = "last_names")
    private String lastNames;
    
    @Column(name = "users")
    private String users;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;
    
    @OneToMany(mappedBy = "idUser")
    private List<Appointment> appointmentList;
    
    @JoinColumn(name = "id_user_status", referencedColumnName = "id_user_status")
    @ManyToOne
    private UserStatus idUserStatus;
    
    @JoinColumn(name = "id_user_type", referencedColumnName = "id_user_type")
    @ManyToOne
    private UserType idUserType;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private List<MedicalDetail> medicalDetailList;

    public Users() {
    }

    public Users(Integer idUser) {
        this.idUser = idUser;
    }

    public Users(Integer idUser, String names, String lastNames, String users, String email, String password) {
        this.idUser = idUser;
        this.names = names;
        this.lastNames = lastNames;
        this.users = users;
        this.email = email;
        this.password = password;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public byte[] getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(byte[] userProfile) {
        this.userProfile = userProfile;
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

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public UserStatus getIdUserStatus() {
        return idUserStatus;
    }

    public void setIdUserStatus(UserStatus idUserStatus) {
        this.idUserStatus = idUserStatus;
    }

    public UserType getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(UserType idUserType) {
        this.idUserType = idUserType;
    }

    public List<MedicalDetail> getMedicalDetailList() {
        return medicalDetailList;
    }

    public void setMedicalDetailList(List<MedicalDetail> medicalDetailList) {
        this.medicalDetailList = medicalDetailList;
    }
}
