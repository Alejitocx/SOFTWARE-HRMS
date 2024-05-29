/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import gestionrecursoshumanos.Conexion.Conexion;
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
public class SalidaDAO {
    Conexion con = new Conexion();
    public void insert(Salida salida) {
        String sql = "INSERT INTO Salida (idSalida, tipoSalida) VALUES (?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, salida.getIdSalida());
            pst.setString(2, salida.getTipoSalida());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Salida salida) {
        String sql = "UPDATE Salida SET tipoSalida = ? WHERE idSalida = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, salida.getTipoSalida());
            pst.setInt(2, salida.getIdSalida());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Salida findById(int idSalida) {
        Salida salida = null;
        String sql = "SELECT * FROM Salida WHERE idSalida = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idSalida);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String tipoSalida = rs.getString("tipoSalida");
                salida = new Salida(idSalida, tipoSalida);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return salida;
    }

    public void delete(int idSalida) {
        String sql = "DELETE FROM Salida WHERE idSalida = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idSalida);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
