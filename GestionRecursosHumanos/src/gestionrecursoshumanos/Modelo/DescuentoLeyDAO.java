/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Modelo;

import gestionrecursoshumanos.Conexion.Conexion;import gestionrecursoshumanos.Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
/**
 *
 * @author alejo
 */
public class DescuentoLeyDAO {
       Conexion con = new Conexion();
    // Buscar DescuentoLey por ID
    public DescuentoLey buscarDescuentoLeyPorId(int id) {
        DescuentoLey descuentoLey = null;
        String sql = "SELECT * FROM DescuentoLey WHERE id_descuento = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int idDescuento = rs.getInt("id_descuento");
                String tipoDescuento = rs.getString("tipo_descuento");
                float porcentaje = rs.getFloat("porsentaje");
                descuentoLey = new DescuentoLey(idDescuento, tipoDescuento, porcentaje);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return descuentoLey;
    }

    // Crear un nuevo DescuentoLey
    public boolean crearDescuentoLey(DescuentoLey descuentoLey) {
        boolean creado = false;
        String sql = "INSERT INTO DescuentoLey (id_descuento, tipo_descuento, porsentaje) VALUES (?, ?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, descuentoLey.getIdDescuento());
            pst.setString(2, descuentoLey.getTipoDescuento());
            pst.setFloat(3, descuentoLey.getPorcentaje());
            creado = pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return creado;
    }

    // Actualizar un DescuentoLey existente
    public boolean actualizarDescuentoLey(DescuentoLey descuentoLey) {
        boolean actualizado = false;
        String sql = "UPDATE DescuentoLey SET tipo_descuento = ?, porsentaje = ? WHERE id_descuento = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, descuentoLey.getTipoDescuento());
            pst.setFloat(2, descuentoLey.getPorcentaje());
            pst.setInt(3, descuentoLey.getIdDescuento());
            actualizado = pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actualizado;
    }

    // Eliminar un DescuentoLey por ID
    public boolean eliminarDescuentoLey(int id) {
        boolean eliminado = false;
        String sql = "DELETE FROM DescuentoLey WHERE id_descuento = ?";
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
