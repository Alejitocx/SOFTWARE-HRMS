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
import javax.swing.JOptionPane;
/**
 *
 * @author alejo
 */
public class ProcesoPersonaDAO {
    Conexion con = new Conexion();
     // Método para insertar un nuevo ProcesoPersona en la base de datos
    public boolean insert(ProcesoPersona procesoPersona) {
        String sql = "INSERT INTO ProcesoPersona (id_procesoPersona, candidato, seleccion) VALUES (?, ?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, procesoPersona.getIdProcesoPersona());
            pst.setInt(2, procesoPersona.getCandidato().getId_persona());
            pst.setInt(3, procesoPersona.getSeleccion().getIdProceso());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para actualizar un ProcesoPersona existente en la base de datos
    public void actualizarProcesoPersona(ProcesoPersona procesoPersona) {
        String sql = "UPDATE ProcesoPersona SET candidato_id = ?, seleccion_id = ? WHERE idProcesoPersona = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, procesoPersona.getCandidato().getId_persona());
            pst.setInt(2, procesoPersona.getSeleccion().getIdProceso());
            pst.setInt(3, procesoPersona.getIdProcesoPersona());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un ProcesoPersona de la base de datos
    public void eliminarProcesoPersona(int idProcesoPersona) {
        String sql = "DELETE FROM ProcesoPersona WHERE id_procesoPersona = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idProcesoPersona);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public static  ProcesoPersona buscarProcesoPersonaPorId(int id) {
    ProcesoPersona procesoPersona = null;
    String sql = "SELECT * FROM ProcesoPersona WHERE id_procesoPersona = ?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int idProcesoPersona = rs.getInt("id_procesoPersona");
            int candidatoId = rs.getInt("candidato");
            int seleccionId = rs.getInt("seleccion");
            Personas candidato = new PersonasDAO().findById(candidatoId);
            ProcesoSeleccion seleccion = new ProcesoSeleccionDAO().buscarProcesoSeleccionPorId(seleccionId);

            // Crear objeto ProcesoPersona con los datos obtenidos
            procesoPersona = new ProcesoPersona(idProcesoPersona, candidato, seleccion);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return procesoPersona;
}
     private Personas buscarPersonaPorId(int id) {
        PersonasDAO personasDAO = new PersonasDAO();
        return personasDAO.findById(id);
    }

    
     private ProcesoSeleccion buscarProcesoSeleccionPorId(int id) {
        ProcesoSeleccionDAO procesoSeleccionDAO = new ProcesoSeleccionDAO();
        return procesoSeleccionDAO.buscarProcesoSeleccionPorId(id);
    }   
 
     public List<ProcesoPersona> findAll() {
       List<ProcesoPersona> listaProcesoPersonas = new ArrayList<>();
    String sql = "SELECT * FROM ProcesoPersona";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            int idProcesoPersona = rs.getInt("id_procesoPersona");
            int candidatoId = rs.getInt("candidato");
            int seleccionId = rs.getInt("seleccion");
            Personas candidato = new PersonasDAO().findById(candidatoId);
            ProcesoSeleccion seleccion = new ProcesoSeleccionDAO().buscarProcesoSeleccionPorId(seleccionId);

            ProcesoPersona procesoPersona = new ProcesoPersona(idProcesoPersona, candidato, seleccion);
            listaProcesoPersonas.add(procesoPersona);
        }
        System.out.println("Total de ProcesoPersona encontrados: " + listaProcesoPersonas.size());
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return listaProcesoPersonas;
}
}
