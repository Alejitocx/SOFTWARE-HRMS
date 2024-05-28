/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TerminacionContrato {
    @Id
    private int idTerminacion;
    private String motivoTerminacion;
    private float pagoExtra;

    @ManyToOne
    private Contrato convenio;

    // Constructor sin parámetros
    public TerminacionContrato() {
    }

    // Constructor con parámetros
    public TerminacionContrato(int idTerminacion, String motivoTerminacion, float pagoExtra, Contrato convenio) {
        this.idTerminacion = idTerminacion;
        this.motivoTerminacion = motivoTerminacion;
        this.pagoExtra = pagoExtra;
        this.convenio = convenio;
    }

    // Getters and Setters
    public int getIdTerminacion() {
        return idTerminacion;
    }

    public void setIdTerminacion(int idTerminacion) {
        this.idTerminacion = idTerminacion;
    }

    public String getMotivoTerminacion() {
        return motivoTerminacion;
    }

    public void setMotivoTerminacion(String motivoTerminacion) {
        this.motivoTerminacion = motivoTerminacion;
    }

    public float getPagoExtra() {
        return pagoExtra;
    }

    public void setPagoExtra(float pagoExtra) {
        this.pagoExtra = pagoExtra;
    }

    public Contrato getConvenio() {
        return convenio;
    }

    public void setConvenio(Contrato convenio) {
        this.convenio = convenio;
    }
}

