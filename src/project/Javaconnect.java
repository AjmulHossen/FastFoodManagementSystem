/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author C4
 */

import java.sql.*;
import javax.swing.JOptionPane;
public class Javaconnect {
    Connection con;
    
    public static Connection ConnecrDb(){
        try {
            
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfood","root","123");
           return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    
}
