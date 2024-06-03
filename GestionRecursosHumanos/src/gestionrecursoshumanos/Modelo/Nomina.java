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
    private int horasTrabajo;
 
    @ManyToOne
    private Salida motivoSalida;
    
    @ManyToOne
    private Contrato convenio;

   // Constructor por defecto
    public Nomina() {
    }

    // Constructor con todos los campos
    public Nomina(int idNomina, float pagoNomina, int horasTrabajo, Salida motivoSalida, Contrato convenio) {
        this.idNomina = idNomina;
        this.pagoNomina = pagoNomina;
        this.horasTrabajo = horasTrabajo;
        this.motivoSalida = motivoSalida;
        this.convenio = convenio;
    }

    // Getters y setters
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

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
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