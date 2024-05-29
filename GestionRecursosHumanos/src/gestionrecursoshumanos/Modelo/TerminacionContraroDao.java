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
import java.sql.*;
/**
 *
 * @author alejo
 */
public class TerminacionContraroDao {
    Conexion con = new Conexion();
    public void insert(TerminacionContrato terminacionContrato) {
        String sql = "INSERT INTO TerminacionContrato (idTerminacion, motivoTerminacion, pagoExtra, convenio_id) VALUES (?, ?, ?, ?)";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, terminacionContrato.getIdTerminacion());
            pst.setString(2, terminacionContrato.getMotivoTerminacion());
            pst.setFloat(3, terminacionContrato.getPagoExtra());
            pst.setInt(4, terminacionContrato.getConvenio().getIdContrato());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(TerminacionContrato terminacionContrato) {
        String sql = "UPDATE TerminacionContrato SET motivoTerminacion = ?, pagoExtra = ?, convenio_id = ? WHERE idTerminacion = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, terminacionContrato.getMotivoTerminacion());
            pst.setFloat(2, terminacionContrato.getPagoExtra());
            pst.setInt(3, terminacionContrato.getConvenio().getIdContrato());
            pst.setInt(4, terminacionContrato.getIdTerminacion());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public TerminacionContrato findById(int idTerminacion) {
        TerminacionContrato terminacionContrato = null;
        String sql = "SELECT * FROM TerminacionContrato WHERE idTerminacion = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idTerminacion);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String motivoTerminacion = rs.getString("motivoTerminacion");
                float pagoExtra = rs.getFloat("pagoExtra");
                int convenioId = rs.getInt("convenio_id");

                Contrato convenio = buscarContratoPorId(convenioId);

                terminacionContrato = new TerminacionContrato(idTerminacion, motivoTerminacion, pagoExtra, convenio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return terminacionContrato;
    }

    public void delete(int idTerminacion) {
        String sql = "DELETE FROM TerminacionContrato WHERE idTerminacion = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idTerminacion);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   private Contrato buscarContratoPorId(int id) {
    Contrato contrato = null;
    String sql = "SELECT * FROM Contrato WHERE idContrato = ?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            String tipoContrato = rs.getString("tipoContrato");
            LocalDate fechaInicio = rs.getDate("fechaInicio").toLocalDate();
            LocalDate fechaFinalizacion = rs.getDate("fechaFinalizacion").toLocalDate();
            // Suponiendo que hay un método para buscar ProcesoPersona por ID
            ProcesoPersona empleado = buscarProcesoPersonaPorId(rs.getInt("empleado_id"));
            contrato = new Contrato(id, tipoContrato, fechaInicio, fechaFinalizacion, empleado);
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
            
            // Supongamos que tenemos estos métodos para obtener Personas y ProcesoSeleccion por sus IDs
            Personas candidato = buscarPersonasPorId(rs.getInt("candidato_id"));
            ProcesoSeleccion seleccion = buscarProcesoSeleccionPorId(rs.getInt("seleccion_id"));

            procesoPersona = new ProcesoPersona(idProcesoPersona, candidato, seleccion);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return procesoPersona;
}

// Método auxiliar para buscar Personas por su ID
private Personas buscarPersonasPorId(int id) {
    Personas persona = null;
    String sql = "SELECT * FROM Personas WHERE idPersona = ?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int idPersona = rs.getInt("idPersona");
            String nombreCompleto = rs.getString("nombreCompleto");
            String telefono = rs.getString("telefono");
            String profesion = rs.getString("profesion");
            String direccion = rs.getString("direccion");
            String email = rs.getString("email");
            int categoriaId = rs.getInt("categoria_id");

            Categoria categoria = buscarCategoriaPorId(categoriaId);
            persona = new Personas(idPersona, nombreCompleto, telefono, profesion, direccion, email, categoria);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return persona;
}

// Método auxiliar para buscar ProcesoSeleccion por su ID
private ProcesoSeleccion buscarProcesoSeleccionPorId(int id) {
    ProcesoSeleccion procesoSeleccion = null;
    String sql = "SELECT * FROM ProcesoSeleccion WHERE idProceso = ?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int idProceso = rs.getInt("idProceso");
            Cargo funcion = buscarCargoPorId(rs.getInt("funcion_id"));

            procesoSeleccion = new ProcesoSeleccion(idProceso, funcion);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return procesoSeleccion;
}

// Método auxiliar para buscar Cargo por su ID
// Método auxiliar para buscar Cargo por su ID
private Cargo buscarCargoPorId(int id) {
    Cargo cargo = null;
    String sql = "SELECT * FROM Cargo WHERE idCargo = ?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int idCargo = rs.getInt("idCargo");
            String cargosDisponibles = rs.getString("cargosDisponibles");
            float salario = rs.getFloat("salario");

            cargo = new Cargo(idCargo, cargosDisponibles, salario);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return cargo;
}

   
    
    
    

    public TerminacionContrato buscarTerminacionContratoPorId(int id) {
        TerminacionContrato terminacionContrato = null;
        String sql = "SELECT * FROM TerminacionContrato WHERE idTerminacion = ?";
        try (Connection con = Conexion.ConnectionAS()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                // Recuperar los datos del resultado de la consulta
                int idTerminacion = rs.getInt("idTerminacion");
                String motivoTerminacion = rs.getString("motivoTerminacion");
                float pagoExtra = rs.getFloat("pagoExtra");
                // Suponiendo que haya un método para buscar el Contrato por su ID
                Contrato contrato = buscarContratoPorId(rs.getInt("convenio_id"));

                // Crear el objeto TerminacionContrato
                terminacionContrato = new TerminacionContrato(idTerminacion, motivoTerminacion, pagoExtra, contrato);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return terminacionContrato;
    }

    private Personas buscarPersonaPorId(int id) {
    Personas persona = null;
    String sql = "SELECT * FROM Personas WHERE idPersona = ?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int idPersona = rs.getInt("idPersona");
            String nombreCompleto = rs.getString("nombreCompleto");
            String telefono = rs.getString("telefono");
            String profesion = rs.getString("profesion");
            String direccion = rs.getString("direccion");
            String email = rs.getString("email");
            int categoriaId = rs.getInt("categoria_id");

            Categoria categoria = buscarCategoriaPorId(categoriaId);
            persona = new Personas(idPersona, nombreCompleto, telefono, profesion, direccion, email, categoria);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return persona;
}

// Método auxiliar para buscar una Categoria por su ID
private Categoria buscarCategoriaPorId(int id) {
    Categoria categoria = null;
    String sql = "SELECT * FROM Categoria WHERE idCategoria = ?";
    try (Connection con = Conexion.ConnectionAS()) {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int idCategoria = rs.getInt("idCategoria");
            String tipo = rs.getString("tipo");

            categoria = new Categoria(idCategoria, tipo);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return categoria;
   }
 }
     
