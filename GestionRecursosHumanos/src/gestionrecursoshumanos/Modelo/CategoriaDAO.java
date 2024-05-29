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
/**
 *
 * @author alejo
 */

public class CategoriaDAO {
    
  
    Conexion con = new Conexion();
   
   
 
    public void insert(Categoria categoria) {
        String sql = "INSERT INTO Categoria (idCategoria, tipo) VALUES (?,?)";
        try (Connection con = Conexion.ConnectionAS) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, categoria.getIdCategoria());
            pst.setString(2, categoria.getTipo());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Categoria categoria) {
        String sql = "UPDATE Categoria SET tipo =? WHERE idCategoria =?";
        try (Connection con = Conexion.ConnectionAS) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, categoria.getTipo());
            pst.setInt(2, categoria.getIdCategoria());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Categoria find(int idCategoria) {
        Categoria categoria = null;
        String sql = "SELECT * FROM Categoria WHERE idCategoria =?";
        try (Connection con = Conexion.ConnectionAS) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idCategoria);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                categoria = new Categoria(rs.getInt("idCategoria"), rs.getString("tipo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoria;
    }


    public void delete(int idCategoria) {
        String sql = "DELETE FROM Categoria WHERE idCategoria =?";
        try (Connection con = Conexion.ConnectionAS) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idCategoria);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
