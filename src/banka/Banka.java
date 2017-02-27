/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

import static banka.Veriler.musteriList;
import java.util.Scanner;

/**
 *
 * @author melisaborekcioglu
 */
public class Banka {

    public static void main(String[] args) {
        int i;
        Scanner kullaniciSecim = new Scanner(System.in);
        System.out.println("Uygun girişi seçiniz:");
        System.out.println("1-MÜSTERİ");
        System.out.println("2-BANKACI");
        i = kullaniciSecim.nextInt();
        int j;
        /////müsteri/////
        while (true) {
            if (i == 1) {
                Scanner islemSecim = new Scanner(System.in);
                System.out.println("1-PARA ÇEKME");
                System.out.println("2-PARA YATIRMA");
                j = islemSecim.nextInt();

                ////müsteri para çekme/////
                if (j == 1) {
                    System.out.println("müşteri tckn: ");
                    Scanner tc = new Scanner(System.in);
                    String tckn = tc.nextLine();

                    System.out.println("Hesap no: ");
                    Scanner hsp = new Scanner(System.in);
                    int hesapNo = hsp.nextInt();

                    System.out.println("çekmek istenen tutar: ");
                    Scanner ttr = new Scanner(System.in);
                    int tutar = ttr.nextInt();
                    Bankaci.paraCek(tckn, hesapNo, tutar);
                }
                ///////müsteri para yatirma///////
                if (j == 2) {
                    System.out.println("müşteri tckn: ");
                    Scanner tc = new Scanner(System.in);
                    String tckn = tc.nextLine();

                    System.out.println("Hesap no: ");
                    Scanner hsp = new Scanner(System.in);
                    int hesapNo = hsp.nextInt();

                    System.out.println("yatırılmak istenen tutar: ");
                    Scanner ttr = new Scanner(System.in);
                    int tutar = ttr.nextInt();

//                    Bankaci cekilen = new Bankaci(1);
                    Bankaci.paraEkle(tckn, hesapNo, tutar);
                    Scanner k = new Scanner(System.in);
                }
                ////bankaci////
            } else if (i == 2) {
                int s;
                System.out.println("Kullanıcı kodunuzu giriniz:");
                Scanner kod = new Scanner(System.in);
                s = kod.nextInt();
                boolean x = Bankaci.kontrol(s);
                if (x == true) {
                    int k;
                    System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("1-PARA ÇEKME/YATIRMA");
                    System.out.println("2-HESAP SİL/EKLE");
                    System.out.println("3-MÜŞTERİ SİL/EKLE");
                    Scanner islem = new Scanner(System.in);
                    k = islem.nextInt();
                    /////islem seçimi/////

                    if (k == 1) {
                        int m;
                        System.out.println("müşteri tckn: ");
                        Scanner tc = new Scanner(System.in);
                        String tckn = tc.nextLine();

                        System.out.println("Hesap no: ");
                        Scanner hsp = new Scanner(System.in);
                        int hesapNo = hsp.nextInt();

                        
                        System.out.println("Şİfre giriniz:");
                        Scanner sifre = new Scanner(System.in);
                        String p = sifre.nextLine();
                        boolean c;
                        c=Bankaci.sifre(p);
                        if(c==true){
                        boolean y;
                        y = Veriler.kontrol(tckn, hesapNo);
                        if (y == true) {
                            System.out.println("1-PARA ÇEKME");
                            System.out.println("2-PARA YATIRMA");
                            Scanner sec = new Scanner(System.in);
                            m = sec.nextInt();
                            ///////bankaci para çekme//////
                            if (m == 1) {
                                System.out.println("MİKTAR GİRİNİZ: ");
                                Scanner ttr = new Scanner(System.in);
                                int tutar = ttr.nextInt();
//                                Bankaci cekilen = new Bankaci(1);
                                Bankaci.paraCek(tckn, hesapNo, tutar);
                            }
                            if (m == 2) {
                                System.out.println("MİKTAR GİRİNİZ: ");
                                Scanner ttr = new Scanner(System.in);
                                int tutar = ttr.nextInt();
//                                Bankaci cekilen = new Bankaci(1);
                                Bankaci.paraEkle(tckn, hesapNo, tutar);
                            }

                        }
                    }
                    }
                    if (k == 2) {
                        
                        System.out.println("müşteri tckn: ");
                        Scanner tc = new Scanner(System.in);
                        String tckn = tc.nextLine();

                        System.out.println("1-HESAP SİL");
                        System.out.println("2-HESAP EKLE");
                        Scanner sec = new Scanner(System.in);
                        int m = sec.nextInt();
                        ///////bankaci hesap sil//////
                        if (m == 1) {
                            System.out.println("Hesap no: ");
                            Scanner hsp = new Scanner(System.in);
                            int hesapNo = hsp.nextInt();
                            boolean y;
                            y = Veriler.kontrol(tckn, hesapNo);
                            if (y == true) {
                                Bankaci.hesapSil(tckn, hesapNo);
                            }
                        }
                        if (m == 2) {
                                Hesap h = new Hesap();
                                h.getAdı();
                                h.getHesapNo();
                                h.getSube();
                                Bankaci.hesapEkle(tckn, h);
                            }
                        }
                    
                    if (k == 3) {
                        int m;
                        System.out.println("1-MÜSTERİ SİL");
                        System.out.println("2-MUSTERİ EKLE");
                        Scanner sec = new Scanner(System.in);
                        m = sec.nextInt();

                        System.out.println("müşteri tckn: ");
                        Scanner tc = new Scanner(System.in);
                        String tckn = tc.nextLine();
                        Musteri must = musteriList.get(0);

                        if (m == 1) {
//                            Bankaci sil = new Bankaci(1);
                            Bankaci.musteriSil(tckn);
                        }
                        if (m == 2) {
                            System.out.println("AD: ");
                            Scanner a = new Scanner(System.in);
                            String b = a.nextLine();
                            must.setAd(b);

                            System.out.println("SOYAD: ");
                            Scanner c = new Scanner(System.in);
                            String d = c.nextLine();
//                            Musteri e = musteriList.get(i);
                            must.setSoyad(d);

                            System.out.println("TC: ");
                            Scanner p = new Scanner(System.in);
                            String r = p.nextLine();
//                            Musteri t = musteriList.get(i);
                            must.setTcNo(r);
                            Bankaci.musteriEkle(must);
//                            System.out.println("BAKİYE: ");
//                            Scanner g = new Scanner(System.in);
//                            int h = g.nextInt();
//                            Hesap o = hesapList.get(i);
//                            f.setBakiye(h);
//                            Bankaci.musteriEkle(f);
                        }
                    }
                    
                }

            }
    }
    }
    public static void Musteri() {
        int sifre;

    }
}


