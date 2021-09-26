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
 * @author JoseM
 */
@Entity
@Table(name = "hospital_department")
public class HospitalDepartment implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_hospital_department")
    private Integer idHospitalDepartment;
    
    @Column(name = "department_name")
    private String departmentName;
    
    @JoinColumn(name = "id_hospital", referencedColumnName = "id_hospital_details")
    @ManyToOne(optional = false)
    private HospitalDetail idHospital;

    public HospitalDepartment() {
    }

    public HospitalDepartment(Integer idHospitalDepartment) {
        this.idHospitalDepartment = idHospitalDepartment;
    }

    public HospitalDepartment(Integer idHospitalDepartment, String departmentName, HospitalDetail idHospital) {
        this.idHospitalDepartment = idHospitalDepartment;
        this.departmentName = departmentName;
        this.idHospital = idHospital;
    }

    public Integer getIdHospitalDepartment() {
        return idHospitalDepartment;
    }

    public void setIdHospitalDepartment(Integer idHospitalDepartment) {
        this.idHospitalDepartment = idHospitalDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public HospitalDetail getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(HospitalDetail idHospital) {
        this.idHospital = idHospital;
    }
    
    
}
