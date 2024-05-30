/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alejo
 */
public class Conexion {
    public static Connection ConnectionAS;
    private  static final String HOSI = "localhost";
    private static final String PUERTQ = "5432";
    private static final String DB = "RECURSOSHUMANOS2";
    private static final String USER = "postgres";
    private static final String CONTRA = "123456";
    
    
       public static Connection ConnectionAS() {
        Connection conexion = null;
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://" + HOSI + ":" + PUERTQ + "/" + DB;
            conexion = DriverManager.getConnection(url, USER, CONTRA);
            System.out.println("Conexión establecida");
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el controlador de PostgreSQL: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return conexion;
    }
}
