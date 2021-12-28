/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.modelBarang;
import view.viewBarang;

/**
 *
 * @author JAR
 */
public class controllerBarang {
    private modelBarang mB;
    private viewBarang vB;
    
    public controllerBarang(viewBarang vB){
        this.vB= vB;
    }
    
    public void simpan(){
        mB = new modelBarang();
        mB.setKodeBarangModel(vB.getKodeBarangView().getText());
        mB.setNamaBarangModel(vB.getNamaBarangView().getText());
        mB.setStokBarangModel(Integer.parseInt(vB.getStokBarangView().getText()));
        mB.setTglExpiredModel(vB.getTglExpiredView().getText());        
        mB.setKeteranganBarangModel(vB.getKeteranganBarangView().getText());
        
        // JOptionPane.showConfirmDialog(vP, " Nama Pelanggan : "+mP.getNamaPelangganModel()+"\n Nomor Hp : "+mP.getNomorHpModel()+"\n Jenis Kelamin : "+mP.getJenisKelaminModel()+"\n Umur : "+mP.getUmur()+"\n Alamat: "+mP.getAlamat());
        
        mB.simpanBarang();
    }
    
    public void bersihkan(){
        // pemanggilan variabel object swing yang ada di view
        vB.getKodeBarangView().setText("");
        vB.getNamaBarangView().setText("");
        vB.getStokBarangView().setText("");
        vB.getTglExpiredView().setText("");
        vB.getKeteranganBarangView().setText("");
    }
    
    public void kontrolButton(){
        vB.getTombolSimpan().setEnabled(true);
        vB.getTombolEdit().setEnabled(false);
        vB.getTombolHapus().setEnabled(false);
        vB.getTombolBatal().setEnabled(true);
    }
    
    public void kontrolButtonDua(){
        vB.getTombolSimpan().setEnabled(false);
        vB.getTombolEdit().setEnabled(true);
        vB.getTombolHapus().setEnabled(true);
        vB.getTombolBatal().setEnabled(true);
    }
    public void deleteData(){
        mB = new modelBarang();
        mB.setKodeBarangModel(vB.getKodeBarangView().getText());
        
        mB.deleteBarang();
        bersihkan();
        kontrolButton();
    }
    
    public void updateData(){
        mB = new modelBarang();
        mB.setKodeBarangModel(vB.getKodeBarangView().getText());
        mB.setNamaBarangModel(vB.getNamaBarangView().getText());
        mB.setStokBarangModel(Integer.parseInt(vB.getStokBarangView().getText()));
        mB.setTglExpiredModel(vB.getTglExpiredView().getText());        
        mB.setKeteranganBarangModel(vB.getKeteranganBarangView().getText());
        
        mB.updateBarang();
        bersihkan();
        kontrolButton();
    }
}
