/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author melisaborekcioglu
 */
public class Bankaci extends Kisi {

    private int bankacıKodu;

    public static ArrayList<Kisi> bankaciList;

    static {
        bankaciList = new ArrayList<>();
        bankaciList.add(new Bankaci(8, "a", "b", "1", "1"));
        //ad soyad şifre tc
    }

    public static boolean kontrol(int bankaciKodu) {

        for (int i = 0; i < bankaciList.size(); i++) {

            if (((Bankaci) bankaciList.get(i)).getBankacıKodu() == bankaciKodu) {
                return true;
            } else {
                System.out.print("kullanıcı bulunamadı");
                return false;
            }
        }
        return false;
    }
     
    public static boolean sifre(String sifre) {

        for (int i = 0; i < musteriList.size(); i++) {

            if (((Musteri) musteriList.get(i)).getSifre().equals(sifre)) {
                return true;
            } else {
                System.out.print("yanlış şifre ! ");
                return false;
            }
        }
        return false;
    }
    
    

    public static void paraEkle(String tckn, int hesapNo, int a) {
        for (int i = 0; i < musteriList.size(); i++) {
            Musteri musteri = musteriList.get(i);
            ArrayList<Hesap> hesapList = musteri.getHesapList();
            if (musteri.getTcNo().equals(tckn)) {
                for (int j = 0; j < hesapList.size(); i++) {
                    if (hesapList.get(i).getHesapNo()==(hesapNo)) {
                        int bakiye = hesapList.get(j).getBakiye();
                        
                        bakiye = bakiye + a;
                        hesapList.get(i).setBakiye(bakiye);
                        System.out.println("Güncel bakiye: " + bakiye);
                        break;
                    } else {
                        System.out.print("kullanıcı bulunamadı");

                    }
                }

            }
        }
    }

    public static void paraCek(String tckn, int hesapNo, int a) {

        for (int i = 0; i < Veriler.musteriList.size(); i++) {
            Musteri musteri = musteriList.get(i);
            if (musteri.getTcNo().equals(tckn)) {                
                ArrayList<Hesap> hesapList = musteri.getHesapList();
                for (int j = 0; j < hesapList.size(); j++) {
                    if (hesapList.get(j).getHesapNo()==hesapNo) {
                        int t = hesapList.get(j).getBakiye();
                        t = t - a;
                        hesapList.get(j).setBakiye(t);
                        System.out.println("Güncel bakiye: " + t);
                        break;
                    } else {
                        System.out.println("kullanıcı bulunamadı");

                    }
                }
            }
        }
    }

    public Bankaci(int bankacıKodu, String ad, String soyad, String sifre, String tcNo) {
        super(ad, soyad, sifre, tcNo);
        this.bankacıKodu = bankacıKodu;
    }

    public int getBankacıKodu() {
        return bankacıKodu;
    }

    public void setBankacıKodu(int bankacıKodu) {
        this.bankacıKodu = bankacıKodu;
    }

    public static boolean hesapSil(String tc, int h) {

        for (int i = 0; i < Veriler.musteriList.size(); i++) {
            if (Veriler.musteriList.get(i).getTcNo().equals(tc)) {
                Musteri musteri = Veriler.musteriList.get(i);
                for (int j = 0; j < musteri.hesapList.size(); j++) {
                    if(h== musteri.hesapList.get(j).getHesapNo())
                        musteri.hesapList.remove(j);
                        System.out.println("hesap silindi");
                        break;
                }
                System.out.println("mevcut değil");
                return true;
            }

        }
        return false;
    }

    public static boolean hesapEkle(String tc, Hesap h) {
        for (int i = 0; i < Veriler.musteriList.size(); i++) {
            if (Veriler.musteriList.get(i).getTcNo().equals(tc)) {
                Musteri musteri = musteriList.get(i);
                musteri.hesapList.add(h);
                
                Random r = new Random(); //random sınıfı
                int a = (100 + (int) (Math.random() * 9));
                h.setHesapNo(a);
                
                System.out.println("hesap eklendi"
                        + "hesap No:"+a);
                break;
            }
        }
        return false;
    }

    public static void musteriEkle(Musteri m) {

        Veriler.musteriList.add(m);
        System.out.println("musteri eklendi");
        
    }

    public static boolean musteriSil(String kimlikNo) {
        for (int i = 0; i < Veriler.musteriList.size(); i++) {
            if (Veriler.musteriList.get(i).getTcNo().equals(kimlikNo)) {
                Veriler.musteriList.remove(i);
                System.out.println("müşteri silindi");
                break;
            }
        }
        return false;
//        Veriler.musteriList.add(m);
    }

}
