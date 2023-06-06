/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.pbo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author M IQBAL
 */
public class Pulsa extends Item {
    public String operator;
    public String no_telp;
    public float nominal;
    
    static ArrayList<Pulsa> daftarPulsa;
    
    public static void loadBarangFromDB(){
       daftarPulsa = new ArrayList<Pulsa>();
       Pulsa pulsa;
        try {
            Statement stmt = DBConnector.connection.createStatement();  
            String sql = "SELECT * FROM pulsa";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                pulsa = new Pulsa();
                pulsa.id_item = rs.getString("id_item");  
                pulsa.nama_item = rs.getString("nama_item");
                pulsa.harga_satuan = rs.getFloat("harga_satuan"); 
                pulsa.operator = rs.getString("operator");
                pulsa.nominal = rs.getFloat("nominal");
                daftarPulsa.add(pulsa);
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
