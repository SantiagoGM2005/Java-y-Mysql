/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio {

    public static void main(String[] args) throws SQLException{
     String url="jdbc:mysql://localhost/ejercicio";
     String usuario="root";
     String password="";
     Connection conexion;
     Statement statement;  
     ResultSet rs;
        try {
            conexion= DriverManager.getConnection(url,usuario,password);
            statement=conexion.createStatement();
            rs=statement.executeQuery("SELECT * FROM `usuarios`");
            while (rs.next()){
                System.out.println(rs.getString("Nombres"));
            }
            statement.execute("INSERT INTO `usuarios` (`Id`, `Documento`, `Nombres`) VALUES (NULL, '1107840530', 'santiago');");
            System.out.println();
            rs=statement.executeQuery("SELECT * FROM `usuarios`");
            while (rs.next()){
                System.out.println("Nombres");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Ejercicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
