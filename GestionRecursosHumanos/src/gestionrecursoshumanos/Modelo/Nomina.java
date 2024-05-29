/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Nomina {
    @Id
    private int idNomina;
    private float pagoNomina;
    
    @ManyToOne
    private HorasTrabajadas horasTrabajo;
    
    @ManyToOne
    private Salida motivoSalida;
    
    @ManyToOne
    private Contrato convenio;

    // Constructor sin parámetros
    public Nomina() {
    }

    // Constructor con parámetros
    public Nomina(int idNomina, float pagoNomina, HorasTrabajadas horasTrabajo, Salida motivoSalida, Contrato convenio) {
        this.idNomina = idNomina;
        this.pagoNomina = pagoNomina;
        this.horasTrabajo = horasTrabajo;
        this.motivoSalida = motivoSalida;
        this.convenio = convenio;
    }

    // Getters and Setters
    public int getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(int idNomina) {
        this.idNomina = idNomina;
    }

    public float getPagoNomina() {
        return pagoNomina;
    }

    public void setPagoNomina(float pagoNomina) {
        this.pagoNomina = pagoNomina;
    }

    public HorasTrabajadas getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(HorasTrabajadas horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public Salida getMotivoSalida() {
        return motivoSalida;
    }

    public void setMotivoSalida(Salida motivoSalida) {
        this.motivoSalida = motivoSalida;
    }

    public Contrato getConvenio() {
        return convenio;
    }

    public void setConvenio(Contrato convenio) {
        this.convenio = convenio;
    }
}