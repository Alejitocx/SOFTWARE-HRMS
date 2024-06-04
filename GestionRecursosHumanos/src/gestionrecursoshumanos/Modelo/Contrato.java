/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Contrato {
    @Id
    private int idContrato;
    private String tipoContrato;
    private LocalDate fechaInicio;
    private String fechaFinalizacion; // Cambiado a String

    @ManyToOne
    private ProcesoPersona empleado;

    // Constructor sin parámetros
    public Contrato() {
    }

    
    // Constructor con parámetros
    public Contrato(int idContrato, String tipoContrato, LocalDate fechaInicio, String fechaFinalizacion, ProcesoPersona empleado) {
        this.idContrato = idContrato;
        this.tipoContrato = tipoContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.empleado = empleado;
    }

    // Getters and Setters
    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public ProcesoPersona getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ProcesoPersona empleado) {
        this.empleado = empleado;
    }
    @Override
public String toString() {
    return String.valueOf(idContrato); // Suponiendo que "idContrato" es el atributo que deseas mostrar
}

}


