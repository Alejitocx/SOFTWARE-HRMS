/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProcesoSeleccion {
    @Id
    private int idProceso;

    @ManyToOne
    private Cargo funcion;

    // Constructor sin parámetros
    public ProcesoSeleccion() {
    }

    // Constructor con parámetros
    public ProcesoSeleccion(int idProceso, Cargo funcion) {
        this.idProceso = idProceso;
        this.funcion = funcion;
    }

    // Getters and Setters
    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public Cargo getFuncion() {
        return funcion;
    }

    public void setFuncion(Cargo funcion) {
        this.funcion = funcion;
    }
}

