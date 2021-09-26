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
import javax.persistence.Table;

/**
 *
 * @author JoseM
 */
@Entity
@Table(name = "hospital_details")
public class HospitalDetail implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_hospital_details")
    private Integer idHospitalDetails;
    
    @Column(name = "hospital_name")
    private String hospitalName;
    
    @Column(name = "address")
    private String address;
    
    @Column (name = "telephone")
    private String telephone;

    public HospitalDetail() {
    }

    public HospitalDetail(Integer idHospitalDetails) {
        this.idHospitalDetails = idHospitalDetails;
    }

    public HospitalDetail(Integer idHospitalDetails, String hospitalName, String address, String telephone) {
        this.idHospitalDetails = idHospitalDetails;
        this.hospitalName = hospitalName;
        this.address = address;
        this.telephone = telephone;
    }

    public Integer getIdHospitalDetails() {
        return idHospitalDetails;
    }

    public void setIdHospitalDetails(Integer idHospitalDetails) {
        this.idHospitalDetails = idHospitalDetails;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    
}
