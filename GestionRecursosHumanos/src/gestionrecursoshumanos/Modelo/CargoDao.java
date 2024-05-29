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
/**

/**
 *
 * @author alejo
 */
public class CargoDao {
    Conexion con = new Conexion();
    private static final String INSERT_SQL = "INSERT INTO Cargo (idCargo, cargosDisponibles, salario) VALUES (?,?,?)";
    private static final String UPDATE_SQL = "UPDATE Cargo SET cargosDisponibles =?, salario =? WHERE idCargo =?";
    private static final String FIND_SQL = "SELECT * FROM Cargo WHERE idCargo =?";
    private static final String DELETE_SQL = "DELETE FROM Cargo WHERE idCargo =?";

    public void insert(Cargo cargo) {
        String sql = INSERT_SQL;
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, cargo.getIdCargo());
            pst.setString(2, cargo.getCargosDisponibles());
            pst.setFloat(3, cargo.getSalario());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Cargo cargo) {
        String sql = UPDATE_SQL;
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cargo.getCargosDisponibles());
            pst.setFloat(2, cargo.getSalario());
            pst.setInt(3, cargo.getIdCargo());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Cargo find(int idCargo) {
        Cargo cargo = null;
        String sql = FIND_SQL;
        try (Connection con = Conexion.ConnectionAS) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idCargo);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                cargo = new Cargo(rs.getInt("idCargo"), rs.getString("cargosDisponibles"), rs.getFloat("salario"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cargo;
    }

    public void delete(int idCargo) {
        String sql = DELETE_SQL;
        try (Connection con = Conexion.ConnectionAS) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idCargo);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
