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
public class EvaluacionDao {
    
    public void insert(Evaluacion evaluacion) {
        String sql = "INSERT INTO Evaluacion (idEvaluacion, calificacion, convenio_id) VALUES (?, ?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, evaluacion.getIdEvaluacion());
            pst.setString(2, evaluacion.getCalificacion());
            pst.setInt(3, evaluacion.getConvenio().getIdContrato());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Evaluacion evaluacion) {
        String sql = "UPDATE Evaluacion SET calificacion = ?, convenio_id = ? WHERE idEvaluacion = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, evaluacion.getCalificacion());
            pst.setInt(2, evaluacion.getConvenio().getIdContrato());
            pst.setInt(3, evaluacion.getIdEvaluacion());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
      public void delete(int idEvaluacion) {
        String sql = "DELETE FROM Evaluacion WHERE idEvaluacion = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idEvaluacion);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   public Evaluacion findByCalificacion(String calificacion) {
    Evaluacion evaluacion = null;
    String sql = "SELECT * FROM Evaluacion WHERE calificacion = ?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, calificacion);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int idEvaluacion = rs.getInt("idEvaluacion");
            int convenioId = rs.getInt("convenio_id");

            Contrato convenio = buscarContratoPorId(convenioId);
            evaluacion = new Evaluacion(idEvaluacion, calificacion, convenio);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return evaluacion;
}
      private Contrato buscarContratoPorId(int id) {
        Contrato contrato = null;
        String sql = "SELECT * FROM Contrato WHERE idContrato = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int idContrato = rs.getInt("idContrato");
                String tipoContrato = rs.getString("tipoContrato");
                LocalDate fechaInicio = rs.getDate("fechaInicio").toLocalDate();
                LocalDate fechaFinalizacion = rs.getDate("fechaFinalizacion").toLocalDate();
                int empleadoId = rs.getInt("empleado_id");

                ProcesoPersona empleado = buscarProcesoPersonaPorId(empleadoId);
                contrato = new Contrato(idContrato, tipoContrato, fechaInicio, fechaFinalizacion, empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contrato;
    }
       private ProcesoPersona buscarProcesoPersonaPorId(int id) {
        ProcesoPersona procesoPersona = null;
        String sql = "SELECT * FROM ProcesoPersona WHERE idProcesoPersona = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int idProcesoPersona = rs.getInt("idProcesoPersona");
                String nombre = rs.getString("nombre");
                // Obtener otros campos relevantes...

               // procesoPersona = new ProcesoPersona(idProcesoPersona, nombre);
                // Rellenar otros campos según sea necesario...
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return procesoPersona;
    }
      
    
}
