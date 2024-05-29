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
public class PersonasDAO {
    Conexion con = new Conexion(); 
      public void insert(Personas persona) {
        String sql = "INSERT INTO Personas (idPersona, nombreCompleto, telefono, profesion, direccion, email, categoria_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, persona.getIdPersona());
            pst.setString(2, persona.getNombreCompleto());
            pst.setString(3, persona.getTelefono());
            pst.setString(4, persona.getProfesion());
            pst.setString(5, persona.getDireccion());
            pst.setString(6, persona.getEmail());
            pst.setInt(7, persona.getCategoria().getIdCategoria());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Personas persona) {
        String sql = "UPDATE Personas SET nombreCompleto = ?, telefono = ?, profesion = ?, direccion = ?, email = ?, categoria_id = ? WHERE idPersona = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, persona.getNombreCompleto());
            pst.setString(2, persona.getTelefono());
            pst.setString(3, persona.getProfesion());
            pst.setString(4, persona.getDireccion());
            pst.setString(5, persona.getEmail());
            pst.setInt(6, persona.getCategoria().getIdCategoria());
            pst.setInt(7, persona.getIdPersona());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Personas findById(int idPersona) {
        Personas persona = null;
        String sql = "SELECT * FROM Personas WHERE idPersona = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idPersona);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String nombreCompleto = rs.getString("nombreCompleto");
                String telefono = rs.getString("telefono");
                String profesion = rs.getString("profesion");
                String direccion = rs.getString("direccion");
                String email = rs.getString("email");
                int categoriaId = rs.getInt("categoria_id");

                Categoria categoria = buscarCategoriaPorId(categoriaId);
                persona = new Personas(idPersona, nombreCompleto, telefono, profesion, direccion, email, categoria);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persona;
    }

    public void delete(int idPersona) {
        String sql = "DELETE FROM Personas WHERE idPersona = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idPersona);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Categoria buscarCategoriaPorId(int id) {
        Categoria categoria = null;
        String sql = "SELECT * FROM Categoria WHERE idCategoria = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String tipo = rs.getString("tipo");
                // Puedes agregar más atributos si es necesario

                categoria = new Categoria(id, tipo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoria;
    }
    
  public Personas buscarPersonaPorId(int id) {
    Personas persona = null;
    String sql = "SELECT * FROM Personas WHERE idPersona = ?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            // Recuperar los datos del resultado de la consulta
            int idPersona = rs.getInt("idPersona");
            String nombreCompleto = rs.getString("nombreCompleto");
            String telefono = rs.getString("telefono");
            String profesion = rs.getString("profesion");
            String direccion = rs.getString("direccion");
            String email = rs.getString("email");
            int idCategoria = rs.getInt("idCategoria");

            // Suponiendo que tienes un método para buscar la categoría por su ID
            Categoria categoria = buscarCategoriaPorId(idCategoria);

            // Crear el objeto Persona con el constructor proporcionado
            persona = new Personas(idPersona, nombreCompleto, telefono, profesion, direccion, email, categoria);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return persona;
}

    Personas buscarPersonasPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
