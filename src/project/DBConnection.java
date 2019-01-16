/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author C4
 */
public class DBConnection {
   public static Connection getDBConnection(){
       Connection con=null;
       Statement stmt=null;
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfood","root","123");
           stmt=con.createStatement();
       } catch (Exception e) {
           e.printStackTrace();
       }
       
       
       return con;

} 
}
