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
public class HorasTrabajadasDAO {
    Conexion con = new Conexion();
    public void insert(HorasTrabajadas horasTrabajadas) {
        String sql = "INSERT INTO HorasTrabajadas (id_horasTrabajadas,ID_CONTRATO, horas_totales) VALUES (?, ?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, horasTrabajadas.getIdHorasTrabajadas());
            pst.setInt(3, horasTrabajadas.getHorasTotales());
            pst.setInt(2, horasTrabajadas.getContrato().getIdContrato()); // Obtener el ID del contrato asociado
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(HorasTrabajadas horasTrabajadas) {
        String sql = "UPDATE HorasTrabajadas SET horas_totales = ?, ID_CONTRATO = ? WHERE id_horasTrabajadas = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, horasTrabajadas.getHorasTotales());
            pst.setInt(2, horasTrabajadas.getContrato().getIdContrato()); // Obtener el ID del contrato asociado
            pst.setInt(3, horasTrabajadas.getIdHorasTrabajadas());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public HorasTrabajadas findById(int idHorasTrabajadas) {
        HorasTrabajadas horasTrabajadas = null;
        String sql = "SELECT * FROM HorasTrabajadas WHERE id_horasTrabajadas = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idHorasTrabajadas);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int horasTotales = rs.getInt("horas_totales");
                int idContrato = rs.getInt("ID_CONTRATO");
                // Crear un objeto Contrato con el ID obtenido
                ContratoDao contratoDAO = new ContratoDao();
                Contrato contrato = contratoDAO.buscarConvenioPorId(idContrato);
                horasTrabajadas = new HorasTrabajadas(idHorasTrabajadas, contrato,horasTotales);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return horasTrabajadas;
    }

    public void delete(int idHorasTrabajadas) {
        String sql = "DELETE FROM HorasTrabajadas WHERE id_horasTrabajadas = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idHorasTrabajadas);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public List<HorasTrabajadas> getAll() {
       List<HorasTrabajadas> listaHorasTrabajadas = new ArrayList<>();
    String sql = "SELECT * FROM HorasTrabajadas";
    try (Connection con = Conexion.ConnectionAS();
         PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {
        while (rs.next()) {
            int idHorasTrabajadas = rs.getInt("id_horasTrabajadas");
            int idContrato = rs.getInt("ID_CONTRATO");
            int horasTotales = rs.getInt("horas_totales");
            // Obtener el contrato asociado
            ContratoDao contratoDAO = new ContratoDao();
            Contrato contrato = contratoDAO.buscarConvenioPorId(idContrato);
            // Crear el objeto HorasTrabajadas y agregarlo a la lista
            HorasTrabajadas horasTrabajadas = new HorasTrabajadas(idHorasTrabajadas,contrato,horasTotales);
            listaHorasTrabajadas.add(horasTrabajadas);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return listaHorasTrabajadas;
    }
   }



