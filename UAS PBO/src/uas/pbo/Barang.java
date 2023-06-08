/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.pbo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author M IQBAL
 */
public class Barang extends Item {
    String expiredString;
    
    static ArrayList<Barang> daftarBarang;
     public static void loadBarangFromDB(){
       daftarBarang = new ArrayList<Barang>();
       Barang barang;
        try {
            Statement stmt = DBConnector.connection.createStatement();  
            String sql = "SELECT * FROM barang";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                barang = new Barang();
                barang.id_item = rs.getString("id_barang");  
                barang.nama_item = rs.getString("nama_barang");
                barang.harga_satuan = rs.getFloat("harga_satuan"); 
                Date expired = rs.getDate("expired");
                barang.expiredString = expired.toString();
                daftarBarang.add(barang);
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
     }
}
