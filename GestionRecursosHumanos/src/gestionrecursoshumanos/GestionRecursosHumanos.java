/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionrecursoshumanos;

import gestionrecursoshumanos.Conexion.Conexion;
import gestionrecursoshumanos.Vista.Administrador;
import gestionrecursoshumanos.Vista.Logins;
import gestionrecursoshumanos.Vista.Usuario;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author alejo
 */
public class GestionRecursosHumanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*   SwingUtilities.invokeLater(() -> {
              //Crear el JFrame
            JFrame frame = new JFrame("GESTION DE RECURSOS HUMANOS");
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame.setSize(830, 500);
             
             // Crear el panel Administrador y añadirlo al frame
             Logins panel = new Logins ();
             frame.add(panel);
             
              //Hacer visible el frame
             frame.setVisible(true);
         });
         */
         Conexion conexion = new Conexion();
         conexion.getConection();
        
    }
    
   
}