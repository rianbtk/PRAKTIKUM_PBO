/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author rian
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Koneksi_1941723007_AgusSalimH {
    public static Connection con;
    public static Statement stm;
    public static void main(String args[]){
        try {
            String url ="jdbc:mysql://localhost/Pertanian";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
    
}
