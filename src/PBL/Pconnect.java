/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBL;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author MANIAC
 */
public class Pconnect {
    Connection conn=null;

    public static Connection ConnectDB()
    {
        try{
           
            Class.forName("org.postgresql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/PBL1", "postgres","123");
            return conn;
           
           
           
       }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
            
            
        }
            
    }
}
    

