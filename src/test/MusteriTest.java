/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author melisaborekcioglu
 */
public class MusteriTest {
    private int tc;
    private ArrayList<HesapTest> list;

    public MusteriTest(int tc) {
        list = new ArrayList<>();
        this.tc = tc;
    }

    public ArrayList<HesapTest> getList() {
        return list;
    }

    public void setList(ArrayList<HesapTest> list) {
        this.list = list;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    
    
}
