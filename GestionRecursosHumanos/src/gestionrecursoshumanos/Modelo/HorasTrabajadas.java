/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;


import java.time.LocalTime;


public class HorasTrabajadas {
   
    private int idHorasTrabajadas;
    private int horasTotales;
    private Contrato contrato; // Relación con la entidad Contrato
    
    // Constructor
    public HorasTrabajadas(){};
            
            
    public HorasTrabajadas(int idHorasTrabajadas, Contrato contrato,int horasTotales) {
        this.idHorasTrabajadas = idHorasTrabajadas;
        this.horasTotales = horasTotales;
        this.contrato = contrato;
    }
    
    // Getters y setters
    public int getIdHorasTrabajadas() {
        return idHorasTrabajadas;
    }

    public void setIdHorasTrabajadas(int idHorasTrabajadas) {
        this.idHorasTrabajadas = idHorasTrabajadas;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}
