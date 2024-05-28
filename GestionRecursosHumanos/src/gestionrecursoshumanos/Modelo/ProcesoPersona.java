/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProcesoPersona {
    @Id
    private int idProcesoPersona;

    @ManyToOne
    private Personas candidato;

    @ManyToOne
    private ProcesoSeleccion seleccion;

    // Constructor sin parámetros
    public ProcesoPersona() {
    }

    // Constructor con parámetros
    public ProcesoPersona(int idProcesoPersona, Personas candidato, ProcesoSeleccion seleccion) {
        this.idProcesoPersona = idProcesoPersona;
        this.candidato = candidato;
        this.seleccion = seleccion;
    }

    // Getters and Setters
    public int getIdProcesoPersona() {
        return idProcesoPersona;
    }

    public void setIdProcesoPersona(int idProcesoPersona) {
        this.idProcesoPersona = idProcesoPersona;
    }

    public Personas getCandidato() {
        return candidato;
    }

    public void setCandidato(Personas candidato) {
        this.candidato = candidato;
    }

    public ProcesoSeleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(ProcesoSeleccion seleccion) {
        this.seleccion = seleccion;
    }
}
