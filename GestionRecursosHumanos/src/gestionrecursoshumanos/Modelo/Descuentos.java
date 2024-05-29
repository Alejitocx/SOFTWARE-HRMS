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
    public class Descuentos {
    @Id
    private int idDescuento;
    
    @ManyToOne
    private DescuentoLey descuentoLey;

    @ManyToOne
    private Nomina nomina;

    // Constructor sin parámetros
    public Descuentos() {
    }

    // Constructor con parámetros
    public Descuentos(int idDescuento, DescuentoLey descuentoLey, Nomina nomina) {
        this.idDescuento = idDescuento;
        this.descuentoLey = descuentoLey;
        this.nomina = nomina;
    }

    // Getters and Setters
    public int getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(int idDescuento) {
        this.idDescuento = idDescuento;
    }

    public DescuentoLey getDescuentoLey() {
        return descuentoLey;
    }

    public void setDescuentoLey(DescuentoLey descuentoLey) {
        this.descuentoLey = descuentoLey;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }
}