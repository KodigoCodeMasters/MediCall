/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.model;

import java.io.Serializable;
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
@Table(name = "patient_pathologies")
public class PatientPathologies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id_patient_pathologies")
    private Integer idPatientPathologies;
    
    @JoinColumn(name = "id_pathologies", referencedColumnName = "id_pathologies")
    @ManyToOne
    private Pathologies idPathologies;
    
    @JoinColumn(name = "id_patient", referencedColumnName = "id_patient")
    @ManyToOne
    private Patient idPatient;

    public PatientPathologies() {
    }

    public PatientPathologies(Integer idPatientPathologies) {
        this.idPatientPathologies = idPatientPathologies;
    }

    public Integer getIdPatientPathologies() {
        return idPatientPathologies;
    }

    public void setIdPatientPathologies(Integer idPatientPathologies) {
        this.idPatientPathologies = idPatientPathologies;
    }

    public Pathologies getIdPathologies() {
        return idPathologies;
    }

    public void setIdPathologies(Pathologies idPathologies) {
        this.idPathologies = idPathologies;
    }

    public Patient getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Patient idPatient) {
        this.idPatient = idPatient;
    }
    
}
