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
public class DescuentosDAO {
     Conexion con = new Conexion();
    public Descuentos buscarDescuentoPorId(int id) {
        Descuentos descuento = null;
        String sql = "SELECT * FROM Descuentos WHERE id_descuentos = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int idDescuento = rs.getInt("id_descuentos");
                DescuentoLey descuentoLey = new DescuentoLeyDAO().buscarDescuentoLeyPorId(rs.getInt("descuentos"));
                Nomina nomina = new NominaDAO().buscarNominaPorId(rs.getInt("nomina"));
                descuento = new Descuentos(idDescuento, descuentoLey, nomina);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return descuento;
    }

    // Crear un nuevo Descuento
    public boolean crearDescuento(Descuentos descuento) {
        boolean creado = false;
        String sql = "INSERT INTO Descuentos (id_descuentos, descuentos, nomina) VALUES (?, ?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, descuento.getIdDescuento());
            pst.setInt(2, descuento.getDescuentoLey().getIdDescuento());
            pst.setInt(3, descuento.getNomina().getIdNomina());
            creado = pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return creado;
    }

    // Actualizar un Descuento existente
    public boolean actualizarDescuento(Descuentos descuento) {
        boolean actualizado = false;
        String sql = "UPDATE Descuentos SET descuentos = ?, nomina = ? WHERE id_descuentos = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, descuento.getDescuentoLey().getIdDescuento());
            pst.setInt(2, descuento.getNomina().getIdNomina());
            pst.setInt(3, descuento.getIdDescuento());
            actualizado = pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actualizado;
    }

    // Eliminar un Descuento por ID
    public boolean eliminarDescuento(int id) {
        boolean eliminado = false;
        String sql = "DELETE FROM Descuentos WHERE id_descuentos = ?";
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
