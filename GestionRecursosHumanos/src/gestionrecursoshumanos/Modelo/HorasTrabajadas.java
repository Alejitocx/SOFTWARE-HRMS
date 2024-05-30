/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;


import java.time.LocalTime;


public class HorasTrabajadas {
   
    private int id_horasTrabajadas;
    private int hora_inicio;
    private int hora_salida;

     // Constructor sin parámetros
    public HorasTrabajadas() {
    }

    // Constructor con parámetros
    public HorasTrabajadas(int id_horasTrabajadas, int hora_inicio, int hora_salida) {
        this.id_horasTrabajadas = id_horasTrabajadas;
        this.hora_inicio = hora_inicio;
        this.hora_salida = hora_salida;
    }

    // Constructor con parámetros usando LocalTime
    public HorasTrabajadas(int id_horasTrabajadas, LocalTime hora_inicio, LocalTime hora_salida) {
        this.id_horasTrabajadas = id_horasTrabajadas;
        this.hora_inicio = hora_inicio.getHour(); // Convertir LocalTime a int (hora)
        this.hora_salida = hora_salida.getHour(); // Convertir LocalTime a int (hora)
    }

    // Getters and Setters
    public int getId_horasTrabajadas() {
        return id_horasTrabajadas;
    }

    public void setId_horasTrabajadas(int id_horasTrabajadas) {
        this.id_horasTrabajadas = id_horasTrabajadas;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }
}
