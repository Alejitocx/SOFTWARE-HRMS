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
    private int id_persona;
    private String  nombre_Completo;
    private String telefono;
    private String profesion;
    private String direccion;
    private String email;

    @ManyToOne
    private Categoria tipo;
    
      public Personas() {
    }
     public Personas(int id_persona, String nombre_Completo, String telefono, String profesion, String direccion, String email, Categoria tipo) {
        this.id_persona = id_persona;
        this.nombre_Completo = nombre_Completo;
        this.telefono = telefono;
        this.profesion = profesion;
        this.direccion = direccion;
        this.email = email;
        this.tipo = tipo;
    }
     
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public void setNombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipo(Categoria tipo) {
        this.tipo = tipo;
    }

    public int getId_persona() {
        return id_persona;
    }

    public String getNombre_Completo() {
        return nombre_Completo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public Categoria getTipo() {
        return tipo;
    }

    
}

