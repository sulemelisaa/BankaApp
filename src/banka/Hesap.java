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
public class Hesap {
    private int hesapNo;
    private String adı;
    private String sube;
    private int bakiye;
    
    public Hesap(int hesapNo, String adı, String sube,int bakiye) {
        this.hesapNo = hesapNo;
        this.adı = adı;
        this.sube = sube;
        this.bakiye=bakiye;
    }

    public Hesap() {
    }
    
    public int getHesapNo() {
        return hesapNo;
    }
    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getAdı() {
        return adı;
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }
    
}
