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
import java.util.Date;
/**
 *
 * @author alejo
 */
public class ContratoDao {
    
    Conexion con = new Conexion(); 
    public void insert(Contrato contrato) {
        String sql = "INSERT INTO Contrato (idContrato, tipoContrato, fechaInicio, fechaFinalizacion, empleado_id) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = Conexion.ConnectionAS) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, contrato.getIdContrato());
            pst.setString(2, contrato.getTipoContrato());
            pst.setDate(3, java.sql.Date.valueOf(contrato.getFechaInicio()));
            pst.setDate(4, java.sql.Date.valueOf(contrato.getFechaFinalizacion()));
            pst.setInt(5, contrato.getEmpleado().getIdProcesoPersona());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
         
        public void update(Contrato contrato) {
        String sql = "UPDATE Contrato SET tipoContrato = ?, fechaInicio = ?, fechaFinalizacion = ?, empleado_id = ? WHERE idContrato = ?";
        try(Connection con = Conexion.ConnectionAS) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, contrato.getTipoContrato());
            pst.setDate(2, java.sql.Date.valueOf(contrato.getFechaInicio()));
            pst.setDate(3, java.sql.Date.valueOf(contrato.getFechaFinalizacion()));
            pst.setInt(4, contrato.getEmpleado().getIdProcesoPersona());
            pst.setInt(5, contrato.getIdContrato());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Contrato find(int idContrato) {
        Contrato contrato = null;
        String sql = "SELECT * FROM Contrato WHERE idContrato = ?";
        try (Connection con = Conexion.ConnectionAS) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idContrato);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String tipoContrato = rs.getString("tipoContrato");
                LocalDate fechaInicio = rs.getDate("fechaInicio").toLocalDate();
                LocalDate fechaFinalizacion = rs.getDate("fechaFinalizacion").toLocalDate();
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
        String sql = "DELETE FROM Contrato WHERE idContrato = ?";
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
        String sql = "SELECT * FROM ProcesoPersona WHERE idProcesoPersona = ?";
        try (Connection con = Conexion.ConnectionAS) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int idProcesoPersona = rs.getInt("idProcesoPersona");
                String nombre = rs.getString("nombre");
 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return procesoPersona;
    }
}