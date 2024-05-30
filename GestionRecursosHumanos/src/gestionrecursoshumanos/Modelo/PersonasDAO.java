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
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alejo
 */
public class PersonasDAO {
    Conexion con = new Conexion(); 
  public boolean insert(Personas persona) {
    String sql = "INSERT INTO Personas (id_persona, nombre_Completo, telefono, profesion, direccion, email, categoria) VALUES (?,?,?,?,?,?,?)";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, persona.getId_persona()); // Cambiado a getId_persona()
        pst.setString(2, persona.getNombre_Completo());
        pst.setString(3, persona.getTelefono());
        pst.setString(4, persona.getProfesion());
        pst.setString(5, persona.getDireccion());
        pst.setString(6, persona.getEmail());
        pst.setInt(7, persona.getTipo().getIdCategoria()); // Asumiendo que Categoria tiene un método getId()
        pst.executeUpdate();
        return true;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

  public void update(Personas persona) {
    String sql = "UPDATE Personas SET nombre_Completo =?, telefono =?, profesion =?, direccion =?, email =?, categoria =? WHERE id_persona =?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, persona.getNombre_Completo());
        pst.setString(2, persona.getTelefono());
        pst.setString(3, persona.getProfesion());
        pst.setString(4, persona.getDireccion());
        pst.setString(5, persona.getEmail());
        pst.setInt(6, persona.getTipo().getIdCategoria()); // Assuming Categoria has a method getIdCategoria()
        pst.setInt(7, persona.getId_persona());
        pst.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public Personas findById(int idPersona) {
    Personas persona = null;
    String sql = "SELECT * FROM Personas WHERE idPersona =?";
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

            Categoria categoria = buscarCategoriaPorId(categoriaId); // Método existente
            persona = new Personas(idPersona, nombreCompleto, telefono, profesion, direccion, email, categoria);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return persona;
}

public void delete(int idPersona) {
    String sql = "DELETE FROM Personas WHERE idPersona =?";
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
    String sql = "SELECT * FROM Categoria WHERE idCategoria =?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            String tipo = rs.getString("tipo");
            // Asumiendo que Categoria tiene un constructor adecuado
            categoria = new Categoria(id, tipo);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return categoria;
}
public List<Personas> listarTodos() {
        List<Personas> listaPersonas = new ArrayList<>();
        String sql = "SELECT * FROM Personas";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombreCompleto = rs.getString("nombre_Completo");
                String telefono = rs.getString("telefono");
                String profesion = rs.getString("profesion");
                String direccion = rs.getString("direccion");
                String email = rs.getString("email");
                int categoriaId = rs.getInt("id_categoria");

                Categoria categoria = buscarCategoriaPorId(categoriaId); // Método existente
                Personas persona = new Personas(idPersona, nombreCompleto, telefono, profesion, direccion, email, categoria);
                listaPersonas.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaPersonas;
    }


}
