/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;
import gestionrecursoshumanos.Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.sql.*;

/**
 *
 * @author alejo
 */
public class HorasTrabajadasDAO {
    public void insert(HorasTrabajadas horasTrabajadas) {
        String sql = "INSERT INTO HorasTrabajadas (idHorasTrabajadas, horaInicio, horaSalida) VALUES (?, ?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, horasTrabajadas.getIdHorasTrabajadas());
            pst.setTime(2, Time.valueOf(horasTrabajadas.getHoraInicio()));
            pst.setTime(3, Time.valueOf(horasTrabajadas.getHoraSalida()));
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(HorasTrabajadas horasTrabajadas) {
        String sql = "UPDATE HorasTrabajadas SET horaInicio = ?, horaSalida = ? WHERE idHorasTrabajadas = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setTime(1, Time.valueOf(horasTrabajadas.getHoraInicio()));
            pst.setTime(2, Time.valueOf(horasTrabajadas.getHoraSalida()));
            pst.setInt(3, horasTrabajadas.getIdHorasTrabajadas());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public HorasTrabajadas findById(int idHorasTrabajadas) {
        HorasTrabajadas horasTrabajadas = null;
        String sql = "SELECT * FROM HorasTrabajadas WHERE idHorasTrabajadas = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idHorasTrabajadas);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                LocalTime horaInicio = rs.getTime("horaInicio").toLocalTime();
                LocalTime horaSalida = rs.getTime("horaSalida").toLocalTime();
                horasTrabajadas = new HorasTrabajadas(idHorasTrabajadas, horaInicio, horaSalida);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return horasTrabajadas;
    }

    public void delete(int idHorasTrabajadas) {
        String sql = "DELETE FROM HorasTrabajadas WHERE idHorasTrabajadas = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idHorasTrabajadas);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
