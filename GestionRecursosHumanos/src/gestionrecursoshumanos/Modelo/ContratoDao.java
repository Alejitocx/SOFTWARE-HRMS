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
import java.time.LocalDate;
/**
 *
 * @author alejo
 */
public class ContratoDao {
    
    Conexion con = new Conexion(); 
 public void insert(Contrato contrato) {
    String sql = "INSERT INTO Contrato (id_contrato, tipo_contrato, fecha_inicio, fecha_finalizacion, empleado) VALUES (?,?,?,?,?)";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, contrato.getIdContrato());
        pst.setString(2, contrato.getTipoContrato());
        pst.setDate(3, java.sql.Date.valueOf(contrato.getFechaInicio()));
        pst.setString(4, contrato.getFechaFinalizacion()); // Cambiado a String directamente
        pst.setInt(5, contrato.getEmpleado().getIdProcesoPersona());
        pst.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public void update(Contrato contrato) {
    String sql = "UPDATE Contrato SET tipo_contrato = ?, fecha_inicio = ?, fecha_finalizacion = ?, empleado_id = ? WHERE id_contrato = ?";
    try(Connection con = Conexion.ConnectionAS) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, contrato.getTipoContrato());
        pst.setDate(2, java.sql.Date.valueOf(contrato.getFechaInicio()));
        pst.setString(3, contrato.getFechaFinalizacion());
        pst.setInt(4, contrato.getEmpleado().getIdProcesoPersona());
        pst.setInt(5, contrato.getIdContrato());
        pst.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public Contrato find(int idContrato) {
    Contrato contrato = null;
    String sql = "SELECT * FROM Contrato WHERE id_contrato = ?";
    try (Connection con = Conexion.ConnectionAS) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, idContrato);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            String tipoContrato = rs.getString("tipo_contrato");
            LocalDate fechaInicio = rs.getDate("fecha_inicio").toLocalDate();
            String fechaFinalizacion = rs.getString("fecha_finalizacion"); // Cambiado a String directamente
            int empleadoId = rs.getInt("empleado_id");

            ProcesoPersona empleado = buscarProcesoPersonaPorId(empleadoId); // Suponiendo que hay un método para esto
            contrato = new Contrato(idContrato, tipoContrato, fechaInicio, fechaFinalizacion, empleado);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return contrato;
}

public void delete(int idContrato) {
    String sql = "DELETE FROM Contrato WHERE id_contrato = ?";
    try (Connection con = Conexion.ConnectionAS) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, idContrato);
        pst.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private ProcesoPersona buscarProcesoPersonaPorId(int id) {
    ProcesoPersona procesoPersona = null;
    String sql = "SELECT * FROM ProcesoPersona WHERE id_proceso_persona = ?";
    try (Connection con = Conexion.ConnectionAS) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int idProcesoPersona = rs.getInt("id_proceso_persona");
            String nombre = rs.getString("nombre");
            // Aquí deberías crear un objeto ProcesoPersona usando los datos obtenidos de la base de datos
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return procesoPersona;
}

}