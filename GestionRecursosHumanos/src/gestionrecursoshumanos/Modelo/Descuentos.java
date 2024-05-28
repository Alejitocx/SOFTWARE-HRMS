/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Descuentos {
    @Id
    private int idDescuentos;
    private int descuentos;

    @ManyToOne
    private DescuentoLey descuentoLey;

    // Constructor sin parámetros
    public Descuentos() {
    }
    

    // Constructor con parámetros
    public Descuentos(int idDescuentos, int descuentos, DescuentoLey descuentoLey) {
        this.idDescuentos = idDescuentos;
        this.descuentos = descuentos;
        this.descuentoLey = descuentoLey;
    }

    // Getters and Setters
    public int getIdDescuentos() {
        return idDescuentos;
    }

    public void setIdDescuentos(int idDescuentos) {
        this.idDescuentos = idDescuentos;
    }

    public int getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(int descuentos) {
        this.descuentos = descuentos;
    }

    public DescuentoLey getDescuentoLey() {
        return descuentoLey;
    }

    public void setDescuentoLey(DescuentoLey descuentoLey) {
        this.descuentoLey = descuentoLey;
    }
}