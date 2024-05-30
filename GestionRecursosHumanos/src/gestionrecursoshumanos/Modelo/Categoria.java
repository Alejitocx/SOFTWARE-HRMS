/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Categoria {
  
    @Id
    private int idCategoria;
    private String tipo;

    // Constructor sin parámetros
    public Categoria() {
    }

    // Constructor con parámetros
    public Categoria(int idCategoria, String tipo) {
        this.idCategoria = idCategoria;
        this.tipo = tipo;
    }

    // Getters and Setters
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

