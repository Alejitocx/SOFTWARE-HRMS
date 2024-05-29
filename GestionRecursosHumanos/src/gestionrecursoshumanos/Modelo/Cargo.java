/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import javax.persistence.Entity;


@Entity
public class Cargo {
    
    private int idCargo;
    private String cargosDisponibles;
    private float salario;

    // Constructor sin parámetros
    public Cargo() {
    }

    // Constructor con parámetros
    public Cargo(int idCargo, String cargosDisponibles, float salario) {
        this.idCargo = idCargo;
        this.cargosDisponibles = cargosDisponibles;
        this.salario = salario;
    }

    // Getters and Setters
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargosDisponibles() {
        return cargosDisponibles;
    }

    public void setCargosDisponibles(String cargosDisponibles) {
        this.cargosDisponibles = cargosDisponibles;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

