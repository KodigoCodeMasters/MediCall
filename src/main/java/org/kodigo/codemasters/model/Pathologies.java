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
@Table(name = "pathologies")
public class Pathologies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id_pathologies")
    private Integer idPathologies;
    
    @Column(name = "pathologies")
    private String pathologies;
    
    @OneToMany(mappedBy = "idPathologies")
    private List<PatientPathologies> patientPathologiesList;

    public Pathologies() {
    }

    public Pathologies(Integer idPathologies) {
        this.idPathologies = idPathologies;
    }

    public Pathologies(Integer idPathologies, String pathologies) {
        this.idPathologies = idPathologies;
        this.pathologies = pathologies;
    }

    public Integer getIdPathologies() {
        return idPathologies;
    }

    public void setIdPathologies(Integer idPathologies) {
        this.idPathologies = idPathologies;
    }

    public String getPathologies() {
        return pathologies;
    }

    public void setPathologies(String pathologies) {
        this.pathologies = pathologies;
    }

    public List<PatientPathologies> getPatientPathologiesList() {
        return patientPathologiesList;
    }

    public void setPatientPathologiesList(List<PatientPathologies> patientPathologiesList) {
        this.patientPathologiesList = patientPathologiesList;
    }
    
}
