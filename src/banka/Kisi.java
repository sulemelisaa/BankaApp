/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

/**
 *
 * @author melisaborekcioglu
 */
public class Kisi extends Veriler {
    
    private String ad;
    private String soyad;
    private String sifre;
    private String tcNo;
   

   
    public Kisi(String ad, String soyad, String sifre, String tcNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.sifre = sifre;
        this.tcNo = tcNo;
    }
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

  
}
