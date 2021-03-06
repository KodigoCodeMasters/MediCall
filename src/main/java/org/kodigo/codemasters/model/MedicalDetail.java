/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Danny
 */
@Entity
@Table(name = "medical_detail")
public class MedicalDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medical_detail")
    private Integer idMedicalDetail;
    
    @Column(name = "studies")
    private String studies;
    
    @Column(name = "work_experience")
    private String workExperience;
    
    @JoinColumn(name = "id_user", referencedColumnName = "USER_ID")
    @ManyToOne(optional = false)
    private User idUser;
    
    @JoinColumn(name = "id_department", referencedColumnName = "id_hospital_department")
    @ManyToOne(optional = false)
    private HospitalDepartment idDepartment;

    public MedicalDetail() {
    }

    public MedicalDetail(Integer idMedicalDetail) {
        this.idMedicalDetail = idMedicalDetail;
    }

    public MedicalDetail(Integer idMedicalDetail, String studies, String workExperience, HospitalDepartment idDepartment) {
        this.idMedicalDetail = idMedicalDetail;
        this.studies = studies;
        this.workExperience = workExperience;
        this.idDepartment = idDepartment;
    }

    public Integer getIdMedicalDetail() {
        return idMedicalDetail;
    }

    public void setIdMedicalDetail(Integer idMedicalDetail) {
        this.idMedicalDetail = idMedicalDetail;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public HospitalDepartment getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(HospitalDepartment idDepartment) {
        this.idDepartment = idDepartment;
    }
    
    
}
