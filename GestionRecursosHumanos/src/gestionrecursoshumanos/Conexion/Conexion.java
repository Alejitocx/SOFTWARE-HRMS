/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionrecursoshumanos.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author alejo
 */
public class Conexion {
    private final String HOSI = "localhost";
    private final String PUERTQ = "5432";
    private final String DB = "RECURSOSHUMANOS1";
    private final String USER = "postgres";
    private final String CONTRA = "123456";
    
    
   public Connection getConection(){
        Connection conexion = null;
        try{
            Class.forName("org.postgresql.Driver");
             String url = "jdbc:postgresql://" + HOSI + ":" + PUERTQ + "/" + DB;            conexion = DriverManager.getConnection(url,USER, CONTRA);
            JOptionPane.showMessageDialog(null,"Conexion Estblecida");
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conexion;
   }
    
    
}
