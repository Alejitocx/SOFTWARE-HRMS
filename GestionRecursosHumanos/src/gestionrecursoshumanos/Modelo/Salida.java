/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;


public class Salida {
   
    private int id_salida;
    private String tipo_salida;

    // Constructor sin parámetros
    public Salida() {
    }

    // Constructor con parámetros
    public Salida(int id_salida, String tipo_salida) {
        this.id_salida = id_salida;
        this.tipo_salida = tipo_salida;
    }

    // Getters and Setters
    public int getId_salida() {
        return id_salida;
    }

    public void setId_salida(int id_salida) {
        this.id_salida = id_salida;
    }

    public String getTipo_salida() {
        return tipo_salida;
    }

    public void setTipo_salida(String tipo_salida) {
        this.tipo_salida = tipo_salida;
    }
}

