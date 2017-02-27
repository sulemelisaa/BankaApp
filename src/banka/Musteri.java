package banka;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author melisaborekcioglu
 */
public class Musteri extends Kisi {

    private String sifre;
    
    public ArrayList<Hesap> hesapList;

    public Musteri(String ad, String soyad, String tcNo, int bakiye, String sifre) {
        super(ad, soyad, sifre, tcNo);
        this.sifre = sifre;
        hesapList = new ArrayList<>();

    }

    
    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public ArrayList<Hesap> getHesapList() {
        return hesapList;
    }

    public void setHesapList(ArrayList<Hesap> hesapList) {
        this.hesapList = hesapList;
    }

//    public  boolean cek(){
//        Bankaci paraCek= new Bankaci(1);
//        return true;
//    }
//    public  boolean yatir(){
//        Bankaci paraYatir= new Bankaci(1);
//        return true;
//    }
}
