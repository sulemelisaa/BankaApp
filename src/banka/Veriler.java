package banka;

import java.util.ArrayList;

/**
 *
 * @author melisaborekcioglu
 */
public class Veriler {

    public static ArrayList<Musteri> musteriList;

    public Veriler() {
    }

    static {
        musteriList = new ArrayList<>();
        Musteri musteri = new Musteri("ahmet", "mehmet", "10", 100, "s");
        musteriList.add(musteri);
        Hesap hesap= new Hesap(11,"q","w",100);
        Hesap hesap1=new Hesap(12,"q1","w1",200);
        Hesap hesap2= new Hesap(13,"q2","w",300);
        Hesap hesap3=new Hesap(14,"q3","w",400);
        musteri.getHesapList().add(hesap);
        musteri.getHesapList().add(hesap1);
        musteri.getHesapList().add(hesap2);
        musteri.getHesapList().add(hesap3);
        
        
        // ad soyad tc bakiye şifre

    }

    public static boolean kontrol(String tckn, int hesapNo) {

        for (int i = 0; i < musteriList.size(); i++) {
            Musteri musteri = musteriList.get(i);
            ArrayList<Hesap> hesapList = musteri.getHesapList();

            if (musteriList.get(i).getTcNo().equals(tckn) && hesapList.get(i).getHesapNo() == hesapNo) {
               
                break;
            } else {
                System.out.print("kullanıcı bulunamadı");
                return false;
            }

        }

        return true;
    }

}

//        if (list.contains("ahmet")) {
//            System.out.println("ahmet bulundu");
//        }

