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
@Table(name = "appointment_notifications")
public class AppointmentNotifications implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_appointment_notifications")
    private Integer idAppointmentNotifications;
    
    @Column(name = "appointment_notifications")
    private String appointmentNotifications;
    
    @Column(name = "date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    
    @Column(name = "patient_email")
    private String patientEmail;
    
    @JoinColumn(name = "id_appointment", referencedColumnName = "id_appointment")
    @ManyToOne
    private Appointment idAppointment;

    public AppointmentNotifications() {
    }

    public AppointmentNotifications(Integer idAppointmentNotifications) {
        this.idAppointmentNotifications = idAppointmentNotifications;
    }

    public AppointmentNotifications(Integer idAppointmentNotifications, String appointmentNotifications, String patientEmail) {
        this.idAppointmentNotifications = idAppointmentNotifications;
        this.appointmentNotifications = appointmentNotifications;
        this.patientEmail = patientEmail;
    }

    public Integer getIdAppointmentNotifications() {
        return idAppointmentNotifications;
    }

    public void setIdAppointmentNotifications(Integer idAppointmentNotifications) {
        this.idAppointmentNotifications = idAppointmentNotifications;
    }

    public String getAppointmentNotifications() {
        return appointmentNotifications;
    }

    public void setAppointmentNotifications(String appointmentNotifications) {
        this.appointmentNotifications = appointmentNotifications;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public Appointment getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(Appointment idAppointment) {
        this.idAppointment = idAppointment;
    }

}
