package com.raka.ArrayObject;

public class DemoShinobi {
    public static void main(String[] args) {
        Shinobi [] a = new Shinobi[3];

        a[0]= new Shinobi();
        a[0].setNoReg("812686");
        a[0].setNama("Uchiha Sasuke");
        a[0].setPeringkatNinja("Genin");

        a[1]= new Shinobi();
        a[1].setNoReg("812678");
        a[1].setNama("Uzumaki Naruto");
        a[1].setPeringkatNinja("Genin");

        a[2]= new Shinobi();
        a[2].setNoReg("812601");
        a[2].setNama("Haruno Sakura");
        a[2].setPeringkatNinja("Genin");

        System.out.println("Data Shinobi\t :");
        for (Shinobi i:a){
            System.out.println("No. Registrasi :"+i.getNoReg());
            System.out.println("Nama           :"+i.getNama());
            System.out.println("Peringkat  :"+i.getPeringkatNinja());
            System.out.println();
        }
    }
}
