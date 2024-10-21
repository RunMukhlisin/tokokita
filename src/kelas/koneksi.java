/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class koneksi {
   private Connection konekSQL;
   private String host = "localhost";
   private String DB = "tokokita";
   private String user = "root";
   private String password = "";
   private String port = "3306";
   private String URL = "jdbc:mysql://" + host + ":" + port + "/" + DB;
   
   public Connection konekDB() throws SQLException{
       try {
           konekSQL = DriverManager.getConnection(URL, user, password);
           
       } catch (SQLException sQLException) {
           System.out.println("koneksi gagal");
       }
       
       return konekSQL;
       
   }
}
