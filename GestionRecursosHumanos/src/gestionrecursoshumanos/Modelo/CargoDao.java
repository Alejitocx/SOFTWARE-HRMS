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
     // Método para encontrar un Cargo por su ID
    public Cargo findById(int idCargo) {
        String sql = "SELECT * FROM Cargo WHERE id_cargo = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idCargo);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id_cargo");
                String cargosDisponibles = rs.getString("cargos_disponibles");
                float salario = rs.getFloat("salario");
                return new Cargo(id, cargosDisponibles, salario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
