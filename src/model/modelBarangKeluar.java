/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.koneksi;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JAR
 */
public class modelBarangKeluar {
    private String idBarangKeluar;
    private String barangKeluar;
    private String kodeBarang;
    private String namaBarang;
    private String barangMasuk;
    private int JumlahBarangKeluar;
    private String tglExpired;
    private String keteranganKeluar;

    public String getIdBarangKeluar() {
        return idBarangKeluar;
    }

    public void setIdBarangKeluar(String idBarangKeluar) {
        this.idBarangKeluar = idBarangKeluar;
    }

    public String getBarangKeluar() {
        return barangKeluar;
    }

    public void setBarangKeluar(String barangKeluar) {
        this.barangKeluar = barangKeluar;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    
    
    public String getBarangMasuk() {
        return barangMasuk;
    }

    public void setBarangMasuk(String barangMasuk) {
        this.barangMasuk = barangMasuk;
    }

    public int getJumlahBarangKeluar() {
        return JumlahBarangKeluar;
    }

    public void setJumlahBarangKeluar(int JumlahBarangKeluar) {
        this.JumlahBarangKeluar = JumlahBarangKeluar;
    }
    
    public String getTglExpired() {
        return tglExpired;
    }

    public void setTglExpired(String tglExpired) {
        this.tglExpired = tglExpired;
    }

    public String getKeteranganKeluar() {
        return keteranganKeluar;
    }

    public void setKeteranganKeluar(String keteranganKeluar) {
        this.keteranganKeluar = keteranganKeluar;
    }
    
    public void simpanLaporanKeluar(){
        
        String sql = "INSERT INTO barang_keluar (id_barang_keluar,barang_keluar,kd_barang, nama_barang,"
                + "barang_masuk, jumlah_barang_keluar, tgl_exp, keterangan_keluar)"
                +"VALUES ('"+getIdBarangKeluar()+"','"+getBarangKeluar()+"','"+getKodeBarang()+"',"
                + "'"+getNamaBarang()+"','"+getBarangMasuk()+"','"+getJumlahBarangKeluar()+"',"
                + "'"+getTglExpired()+"','"+getKeteranganKeluar()+"')";
        
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            JOptionPane.showMessageDialog(null,"Data transaksi berhasil disimpan");
        
        } catch (SQLException ex) {
            Logger.getLogger(modelBarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
    }
}
