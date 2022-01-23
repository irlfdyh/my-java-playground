package com.plygrnd.java.college.progress.polymorphism;

/**
 * Polimorpisme menggunakan objek referensi
 */

class A{
    public void cetak(){
        System.out.println("Metode dari kelas A");
    }
}
class B extends A{
    public void cetak(){
        System.out.println("Metode dari kelas B");
    }
}
class C extends A{
    public void cetak(){
        System.out.println("Metode dari kelas C");
    }
}

public class Contoh1 {

    public static void main(String[] args) {

        A objekA = new A();
        B objekB = new B();
        C objekC = new C();

        objekA.cetak();
        objekA = objekB;
        objekA.cetak();
        objekA = objekC;
        objekA.cetak();

    }

}
