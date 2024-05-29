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
public class ProcesoPersonaDAO {
     // Método para insertar un nuevo ProcesoPersona en la base de datos
    public void insertarProcesoPersona(ProcesoPersona procesoPersona) {
        String sql = "INSERT INTO ProcesoPersona (idProcesoPersona, candidato_id, seleccion_id) VALUES (?, ?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, procesoPersona.getIdProcesoPersona());
            pst.setInt(2, procesoPersona.getCandidato().getIdPersona());
            pst.setInt(3, procesoPersona.getSeleccion().getIdProceso());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para actualizar un ProcesoPersona existente en la base de datos
    public void actualizarProcesoPersona(ProcesoPersona procesoPersona) {
        String sql = "UPDATE ProcesoPersona SET candidato_id = ?, seleccion_id = ? WHERE idProcesoPersona = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, procesoPersona.getCandidato().getIdPersona());
            pst.setInt(2, procesoPersona.getSeleccion().getIdProceso());
            pst.setInt(3, procesoPersona.getIdProcesoPersona());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un ProcesoPersona de la base de datos
    public void eliminarProcesoPersona(int idProcesoPersona) {
        String sql = "DELETE FROM ProcesoPersona WHERE idProcesoPersona = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idProcesoPersona);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para buscar un ProcesoPersona por su ID
    public ProcesoPersona buscarProcesoPersonaPorId(int id) {
        ProcesoPersona procesoPersona = null;
        String sql = "SELECT * FROM ProcesoPersona WHERE idProcesoPersona = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int idProcesoPersona = rs.getInt("idProcesoPersona");
                int candidatoId = rs.getInt("candidato_id");
                int seleccionId = rs.getInt("seleccion_id");
                Personas candidato = buscarPersonaPorId(candidatoId);
                ProcesoSeleccion seleccion = buscarProcesoSeleccionPorId(seleccionId);

                procesoPersona = new ProcesoPersona(idProcesoPersona, candidato, seleccion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return procesoPersona;
    }
     private Personas buscarPersonaPorId(int id) {
        PersonasDAO personasDAO = new PersonasDAO();
        return personasDAO.buscarPersonasPorId(id);
    }

    
     private ProcesoSeleccion buscarProcesoSeleccionPorId(int id) {
        ProcesoSeleccionDAO procesoSeleccionDAO = new ProcesoSeleccionDAO();
        return procesoSeleccionDAO.buscarProcesoSeleccionPorId(id);
    }   
 
}
