package com.plygrnd.java.college.progress.inheritance;

class ASuper {
    protected int a,b;
}
class BSuper extends ASuper {
    protected int a,b;
    public void setabKelasInduk(int a, int b) {
        super.a = a;
        super.b = b;
    }
    public void setabKelas(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String getabKelasInduk() {
        return "a:"+super.a+" & b:"+super.b;
    }
    public String getabKelas() {
        return "a:"+a+" & b:"+b;
    }
}

public class DemoKataKunciSuper {
    public static void main(String[] args){
        BSuper kelasB = new BSuper();
        kelasB.setabKelasInduk(2, 4);
        kelasB.setabKelas(6, 8);
        System.out.println("Memanggil metode getabKelasInduk()");
        System.out.println(kelasB.getabKelasInduk());
        System.out.println("Memanggil metode getabKelas()");
        System.out.println(kelasB.getabKelas());
    }
}
