/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DescuentoLey {
    @Id
    private int idDescuento;
    private String tipoDescuento;

    // Constructor sin parámetros
    public DescuentoLey() {
    }

    // Constructor con parámetros
    public DescuentoLey(int idDescuento, String tipoDescuento) {
        this.idDescuento = idDescuento;
        this.tipoDescuento = tipoDescuento;
    }

    // Getters y Setters
    public int getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(int idDescuento) {
        this.idDescuento = idDescuento;
    }

    public String getTipoDescuento() {
        return tipoDescuento;
    }

    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }
}
