/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;


import java.time.LocalTime;


public class HorasTrabajadas {
   
    private int idHorasTrabajadas;
    private LocalTime horaInicio;
    private LocalTime horaSalida;

    // Constructor sin parámetros
    public HorasTrabajadas() {
    }

    // Constructor con parámetros
    public HorasTrabajadas(int idHorasTrabajadas, LocalTime horaInicio, LocalTime horaSalida) {
        this.idHorasTrabajadas = idHorasTrabajadas;
        this.horaInicio = horaInicio;
        this.horaSalida = horaSalida;
    }

    // Getters and Setters
    public int getIdHorasTrabajadas() {
        return idHorasTrabajadas;
    }

    public void setIdHorasTrabajadas(int idHorasTrabajadas) {
        this.idHorasTrabajadas = idHorasTrabajadas;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }
}
