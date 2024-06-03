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
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alejo
 */
public class EvaluacionDao {
    Conexion con = new Conexion();
    public void insert(Evaluacion evaluacion) {
        String sql = "INSERT INTO Evaluacion (id_evaluacion, calificacion, convenio) VALUES (?, ?, ?)";
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
            int convenioId = rs.getInt("convenio");

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
    String sql = "SELECT * FROM Contrato WHERE id_contrato = ?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int idContrato = rs.getInt("id_contrato");
            String tipoContrato = rs.getString("tipo_contrato");
            LocalDate fechaInicio = rs.getDate("fecha_inicio").toLocalDate();
            String fechaFinalizacion = rs.getString("fecha_finalizacion"); // Cambiado a String directamente
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
     
  public List<Evaluacion> buscarEvaluacionesPorConvenioId(int convenioId) {
    List<Evaluacion> evaluaciones = new ArrayList<>();
    String sql = "SELECT * FROM Evaluacion WHERE convenio = ?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, convenioId);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            int idEvaluacion = rs.getInt("id_evaluacion");
            String calificacion = rs.getString("calificacion");
            int contratoId = rs.getInt("convenio"); // campo 'convenio' en la tabla Evaluacion

            Contrato contrato = new ContratoDao().buscarConvenioPorId(contratoId); // Obteniendo el Contrato relacionado
            Evaluacion evaluacion = new Evaluacion(idEvaluacion, calificacion, contrato);
            evaluaciones.add(evaluacion);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return evaluaciones;
}
    
}
