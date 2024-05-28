/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;


public class Salida {
   
    private int idSalida;
    private String tipoSalida;

    // Constructor sin parámetros
    public Salida() {
    }

    // Constructor con parámetros
    public Salida(int idSalida, String tipoSalida) {
        this.idSalida = idSalida;
        this.tipoSalida = tipoSalida;
    }

    // Getters and Setters
    public int getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(int idSalida) {
        this.idSalida = idSalida;
    }

    public String getTipoSalida() {
        return tipoSalida;
    }

    public void setTipoSalida(String tipoSalida) {
        this.tipoSalida = tipoSalida;
    }
}
