/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Evaluacion {
    @Id
    private int idEvaluacion;
    private String calificacion;

    @ManyToOne
    private Contrato convenio;

    // Constructor sin parámetros
    public Evaluacion() {
    }

    // Constructor con parámetros
    public Evaluacion(int idEvaluacion, String calificacion, Contrato convenio) {
        this.idEvaluacion = idEvaluacion;
        this.calificacion = calificacion;
        this.convenio = convenio;
    }

    // Getters and Setters
    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Contrato getConvenio() {
        return convenio;
    }

    public void setConvenio(Contrato convenio) {
        this.convenio = convenio;
    }
}

