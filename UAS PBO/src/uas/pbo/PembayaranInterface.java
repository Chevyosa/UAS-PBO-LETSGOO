/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uas.pbo;

import java.time.LocalDateTime;

/**
 *
 * @author M IQBAL
 */
public interface PembayaranInterface {
    float getTotalHarga();
    void setTotalHarga(float totalHarga);
    
    String getWaktuPembayaran();
    void setWaktuPembayaran(String waktuPembayaran);
    
    int getIDPembayaran();
    void setIDPembayaran(int IDPembayaram);
}
