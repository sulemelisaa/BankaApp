/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static banka.Veriler.musteriList;
import java.util.ArrayList;
import java.util.Scanner;
import test.MusteriTest;
import test.HesapTest;

/**
 *
 * @author melisaborekcioglu
 */
public class Main {

    public static void main(String[] args) {
        HesapTest b1 = new HesapTest(1);
        HesapTest b2 = new HesapTest(2);
        HesapTest b3 = new HesapTest(3);
        MusteriTest a1 = new MusteriTest(8);
        MusteriTest a2 = new MusteriTest(9);

        ArrayList<MusteriTest> musteriList = new ArrayList<>();
        musteriList.add(a1);
        musteriList.add(a2);

        a1.getList().add(b1);
        a1.getList().add(b2);
        a2.getList().add(b3);

        Scanner secim = new Scanner(System.in);
        System.out.println("Tc giriniz:");
        int tc = secim.nextInt();

        System.out.println("Silmek istediğiniz hesap:");
        int hesapNo = secim.nextInt();

        for (int i = 0; i < musteriList.size(); i++) {
            if (musteriList.get(i).getTc() == tc) {
                MusteriTest musteri = musteriList.get(i);
                ArrayList<HesapTest> hesapList = musteri.getList();
                for (int j = 0; j < hesapList.size(); j++) {
                    if (hesapList.get(j).getId() == hesapNo) {
                        hesapList.remove(j);
                    }

                }
            } else {
                break;
            }
        }

        System.out.println(musteriList);
    }
}
