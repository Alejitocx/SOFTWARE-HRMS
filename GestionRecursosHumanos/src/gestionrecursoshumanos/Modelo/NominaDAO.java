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
public class NominaDAO {
    Conexion con = new Conexion();
      // Buscar Nomina por ID
    public Nomina buscarNominaPorId(int id) {
        Nomina nomina = null;
        String sql = "SELECT * FROM Nomina WHERE id_nomina = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int idNomina = rs.getInt("id_nomina");
                float pagoNomina = rs.getFloat("pagoNomina");
                HorasTrabajadas horasTrabajo = new HorasTrabajadasDAO().findById(rs.getInt("horasTrabajo"));
                Salida motivoSalida = new SalidaDAO().findById(rs.getInt("motivoSalida"));
                Contrato convenio = new ContratoDao().buscarConvenioPorId(rs.getInt("convenio"));
                nomina = new Nomina(idNomina, pagoNomina, horasTrabajo, motivoSalida, convenio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nomina;
    }

    // Crear una nueva Nomina
    public boolean crearNomina(Nomina nomina) {
        boolean creado = false;
        String sql = "INSERT INTO Nomina (id_nomina, pagoNomina, horasTrabajo, motivoSalida, convenio) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, nomina.getIdNomina());
            pst.setFloat(2, nomina.getPagoNomina());
            pst.setInt(3, nomina.getHorasTrabajo().getIdHorasTrabajadas());
            pst.setInt(4, nomina.getMotivoSalida().getId_salida());
            pst.setInt(5, nomina.getConvenio().getIdContrato());
            creado = pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return creado;
    }

    // Actualizar una Nomina existente
    public boolean actualizarNomina(Nomina nomina) {
        boolean actualizado = false;
        String sql = "UPDATE Nomina SET pagoNomina = ?, horasTrabajo = ?, motivoSalida = ?, convenio = ? WHERE id_nomina = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setFloat(1, nomina.getPagoNomina());
            pst.setInt(2, nomina.getHorasTrabajo().getIdHorasTrabajadas());
            pst.setInt(3, nomina.getMotivoSalida().getId_salida());
            pst.setInt(4, nomina.getConvenio().getIdContrato());
            pst.setInt(5, nomina.getIdNomina());
            actualizado = pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actualizado;
    }

    // Eliminar una Nomina por ID
    public boolean eliminarNomina(int id) {
        boolean eliminado = false;
        String sql = "DELETE FROM Nomina WHERE id_nomina = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            eliminado = pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return eliminado;
    }
}
