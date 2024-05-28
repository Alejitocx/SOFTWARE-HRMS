/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Personas {
    @Id
    private int idPersona;
    private String nombreCompleto;
    private String telefono;
    private String profesion;
    private String direccion;
    private String email;

    @ManyToOne
    private Categoria categoria;

    // Constructor sin parámetros
    public Personas() {
    }

    // Constructor con parámetros
    public Personas(int idPersona, String nombreCompleto, String telefono, String profesion, String direccion, String email, Categoria categoria) {
        this.idPersona = idPersona;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.profesion = profesion;
        this.direccion = direccion;
        this.email = email;
        this.categoria = categoria;
    }

    // Getters and Setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

