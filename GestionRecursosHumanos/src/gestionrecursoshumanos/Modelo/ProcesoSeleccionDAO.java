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
public class ProcesoSeleccionDAO {
    Conexion con = new Conexion();

    public void insert(ProcesoSeleccion procesoSeleccion) {
        String sql = "INSERT INTO ProcesoSeleccion (idProceso, funcion_id) VALUES (?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, procesoSeleccion.getIdProceso());
            pst.setInt(2, procesoSeleccion.getFuncion().getIdCargo());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(ProcesoSeleccion procesoSeleccion) {
        String sql = "UPDATE ProcesoSeleccion SET funcion_id = ? WHERE idProceso = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, procesoSeleccion.getFuncion().getIdCargo());
            pst.setInt(2, procesoSeleccion.getIdProceso());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ProcesoSeleccion findById(int idProceso) {
        ProcesoSeleccion procesoSeleccion = null;
        String sql = "SELECT * FROM ProcesoSeleccion WHERE idProceso = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idProceso);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int funcionId = rs.getInt("funcion_id");
                Cargo funcion = buscarCargoPorId(funcionId);
                procesoSeleccion = new ProcesoSeleccion(idProceso, funcion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return procesoSeleccion;
    }

    public void delete(int idProceso) {
        String sql = "DELETE FROM ProcesoSeleccion WHERE idProceso = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idProceso);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Cargo buscarCargoPorId(int id) {
        Cargo cargo = null;
        String sql = "SELECT * FROM Cargo WHERE idCargo = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String cargosDisponibles = rs.getString("cargosDisponibles");
                float salario = rs.getFloat("salario");
                cargo = new Cargo(id, cargosDisponibles, salario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cargo;
    }

    ProcesoSeleccion buscarProcesoSeleccionPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
