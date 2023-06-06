/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.pbo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import static uas.pbo.Pulsa.daftarPulsa;

/**
 *
 * @author M IQBAL
 */
public class Token extends Item {
    public String no_meteran;
    public float nominal;
    
    static ArrayList<Token> daftarToken;
    
    public static void loadBarangFromDB(){
       daftarToken = new ArrayList<Token>();
       Token token;
        try {
            Statement stmt = DBConnector.connection.createStatement();  
            String sql = "SELECT * FROM token";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                token = new Token();
                token.id_item = rs.getString("id_item");  
                token.nama_item = rs.getString("nama_item");
                token.harga_satuan = rs.getFloat("harga_satuan"); 
                token.nominal = rs.getFloat("nominal");
                daftarToken.add(token);
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
