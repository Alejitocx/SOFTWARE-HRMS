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
            int horasTrabajo = rs.getInt("horasTrabajo");
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
        pst.setInt(1, nomina.getIdNomina()); // Línea 51
        pst.setFloat(2, nomina.getPagoNomina());
        pst.setInt(3, nomina.getHorasTrabajo()); // Aquí se asume que horasTrabajo es un valor entero, no un ID
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
        pst.setInt(2, nomina.getHorasTrabajo());
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
public List<Nomina> obtenerTodasLasNominas() {
        List<Nomina> nominas = new ArrayList<>();
        String sql = "SELECT * FROM Nomina";
        try (Connection con = Conexion.ConnectionAS();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                int idNomina = rs.getInt("id_nomina");
                float pagoNomina = rs.getFloat("pagoNomina");
                int horasTrabajo = rs.getInt("horasTrabajo");
                int idMotivoSalida = rs.getInt("motivoSalida");
                int idConvenio = rs.getInt("convenio");

                // Obtener motivo salida
                Salida motivoSalida = new SalidaDAO().findById(idMotivoSalida);

                // Obtener contrato
                Contrato contrato = new ContratoDao().buscarConvenioPorId(idConvenio);

                // Crear objeto Nomina y agregarlo a la lista
                Nomina nomina = new Nomina(idNomina, pagoNomina, horasTrabajo, motivoSalida, contrato);
                nominas.add(nomina);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nominas;
    }

}
