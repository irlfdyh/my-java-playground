package com.plygrnd.java.college.progress.polymorphism;

/**
 * Polimorpisme menggunakan argumen (passing referensi)
 */

class AContoh2 {
    protected int nilai;
    public String cetak(){
        return "kelas A";
    }
}

class BContoh2 extends AContoh2 {
    public BContoh2(int nilai){
        this.nilai = nilai;
    }
    public String cetak(){
        return "kelas B";
    }
}

class CContoh2 extends AContoh2 {
    public CContoh2(int nilai){
        this.nilai = nilai;
    }
    public String cetak(){
        return "kelas C";
    }
}

public class Contoh2 {

    public static void cetakInfo(AContoh2 objek) {
        System.out.println(objek.cetak() + " dengan nilai: " + objek.nilai);
    }

    public static void main(String[] args) {

        AContoh2 objekA = new AContoh2();
        BContoh2 objekB = new BContoh2(10);
        CContoh2 objekC = new CContoh2(15);

        cetakInfo(objekA);
        cetakInfo(objekB);
        cetakInfo(objekC);

    }

}
