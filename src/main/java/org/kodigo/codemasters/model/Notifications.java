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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Danny
 */
@Entity
@Table(name = "notifications")
public class Notifications implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notification")
    private Integer idNotification;
    
    @Column(name = "notification")
    private String notification;
    
    
    @Column(name = "notifycation_message")
    private String notifycationMessage;
    
    @Column(name = "date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    
    @Column(name = "patient_email")
    private String patientEmail;

    public Notifications() {
    }

    public Notifications(Integer idNotification) {
        this.idNotification = idNotification;
    }

    public Notifications(Integer idNotification, String notification, String notifycationMessage, String patientEmail) {
        this.idNotification = idNotification;
        this.notification = notification;
        this.notifycationMessage = notifycationMessage;
        this.patientEmail = patientEmail;
    }

    public Integer getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(Integer idNotification) {
        this.idNotification = idNotification;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getNotifycationMessage() {
        return notifycationMessage;
    }

    public void setNotifycationMessage(String notifycationMessage) {
        this.notifycationMessage = notifycationMessage;
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

}
