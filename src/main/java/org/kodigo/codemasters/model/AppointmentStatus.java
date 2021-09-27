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
@Table(name = "appointment_status")
public class AppointmentStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_appointment_status")
    private Integer idAppointmentStatus;
    
    @Column(name = "appointment_status")
    private String appointmentStatus;
    
//    @OneToMany(mappedBy = "idAppointmentStatus")
//    private List<Appointment> appointmentList;

    public AppointmentStatus() {
    }

    public AppointmentStatus(Integer idAppointmentStatus) {
        this.idAppointmentStatus = idAppointmentStatus;
    }

    public AppointmentStatus(Integer idAppointmentStatus, String appointmentStatus) {
        this.idAppointmentStatus = idAppointmentStatus;
        this.appointmentStatus = appointmentStatus;
    }

    public Integer getIdAppointmentStatus() {
        return idAppointmentStatus;
    }

    public void setIdAppointmentStatus(Integer idAppointmentStatus) {
        this.idAppointmentStatus = idAppointmentStatus;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

//    public List<Appointment> getAppointmentList() {
//        return appointmentList;
//    }
//
//    public void setAppointmentList(List<Appointment> appointmentList) {
//        this.appointmentList = appointmentList;
//    }
    
}
