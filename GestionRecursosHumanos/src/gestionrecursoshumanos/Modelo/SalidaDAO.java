/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import gestionrecursoshumanos.Conexion.Conexion;
import gestionrecursoshumanos.Conexion.Conexion;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author alejo
 */
public class SalidaDAO {
    Conexion con = new Conexion();
   
    public void insert(Salida salida) {
        String sql = "INSERT INTO Salida (id_salida, tipo_salida) VALUES (?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, salida.getId_salida());
            pst.setString(2, salida.getTipo_salida());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Salida salida) {
        String sql = "UPDATE Salida SET tipo_salida = ? WHERE id_salida = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, salida.getTipo_salida());
            pst.setInt(2, salida.getId_salida());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Salida findById(int id_salida) {
        Salida salida = null;
        String sql = "SELECT * FROM Salida WHERE id_salida = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id_salida);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String tipo_salida = rs.getString("tipo_salida");
                salida = new Salida(id_salida, tipo_salida);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return salida;
    }

    public void delete(int id_salida) {
        String sql = "DELETE FROM Salida WHERE id_salida = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id_salida);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
   public List<Salida> getAll() {
    List<Salida> listaSalidas = new ArrayList<>();
    String sql = "SELECT * FROM Salida";
    try (Connection con = Conexion.ConnectionAS();
         PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {
        while (rs.next()) {
            int id_salida = rs.getInt("id_salida");
            String tipo_salida = rs.getString("tipo_salida");
            Salida salida = new Salida(id_salida, tipo_salida);
            listaSalidas.add(salida);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return listaSalidas;
}
}
