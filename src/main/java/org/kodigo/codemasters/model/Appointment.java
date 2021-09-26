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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Danny
 */
@Entity
@Table(name = "appointment")
public class Appointment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_appointment")
    private Integer idAppointment;
    
    @Column(name = "appointment_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date appointmentDate;
    
    @JoinColumn(name = "id_appointment_status", referencedColumnName = "id_appointment_status")
    @ManyToOne
    private AppointmentStatus idAppointmentStatus;
    
    @JoinColumn(name = "id_patient", referencedColumnName = "id_patient")
    @ManyToOne
    private Patient idPatient;
    
    public Appointment() {
    }

    public Appointment(Integer idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Integer getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(Integer idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public AppointmentStatus getIdAppointmentStatus() {
        return idAppointmentStatus;
    }

    public void setIdAppointmentStatus(AppointmentStatus idAppointmentStatus) {
        this.idAppointmentStatus = idAppointmentStatus;
    }

    public Patient getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Patient idPatient) {
        this.idPatient = idPatient;
    }
    
}
