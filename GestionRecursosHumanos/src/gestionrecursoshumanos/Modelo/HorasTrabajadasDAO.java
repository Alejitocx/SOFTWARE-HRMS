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
    Conexion con = new Conexion();
   public void insert(HorasTrabajadas horasTrabajadas) {
        String sql = "INSERT INTO HorasTrabajadas (id_horasTrabajadas, hora_inicio, hora_salida) VALUES (?, ?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, horasTrabajadas.getId_horasTrabajadas());
            pst.setInt(2, horasTrabajadas.getHora_inicio()); // Insertar como entero
            pst.setInt(3, horasTrabajadas.getHora_salida()); // Insertar como entero
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(HorasTrabajadas horasTrabajadas) {
        String sql = "UPDATE HorasTrabajadas SET hora_inicio = ?, hora_salida = ? WHERE id_horasTrabajadas = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, horasTrabajadas.getHora_inicio()); // Actualizar como entero
            pst.setInt(2, horasTrabajadas.getHora_salida()); // Actualizar como entero
            pst.setInt(3, horasTrabajadas.getId_horasTrabajadas());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public HorasTrabajadas findById(int id_horasTrabajadas) {
        HorasTrabajadas horasTrabajadas = null;
        String sql = "SELECT * FROM HorasTrabajadas WHERE id_horasTrabajadas = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id_horasTrabajadas);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int hora_inicio = rs.getInt("hora_inicio"); // Obtener como entero
                int hora_salida = rs.getInt("hora_salida"); // Obtener como entero
                horasTrabajadas = new HorasTrabajadas(id_horasTrabajadas, hora_inicio, hora_salida);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return horasTrabajadas;
    }

    public void delete(int id_horasTrabajadas) {
        String sql = "DELETE FROM HorasTrabajadas WHERE id_horasTrabajadas = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id_horasTrabajadas);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
