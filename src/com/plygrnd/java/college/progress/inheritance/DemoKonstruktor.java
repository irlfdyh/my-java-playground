package com.plygrnd.java.college.progress.inheritance;

class A {
    public A() {
        System.out.println("Konstruktor kelas A");
    }
}
class B extends A {
    public B() {
        System.out.println("Konstruktor kelas B");
    }
}
class C extends B {
    public C() {
        System.out.println("Konstruktor kelas C");
    }
}
class D extends B {
    public D() {
        System.out.println("Konstruktor kelas D");
    }
}

public class DemoKonstruktor {

    public static void main(String[] args) {
        System.out.println("Meinstansiasi kelas C");
        C kelasC = new C(); //Perhatikan sintaks ini
        System.out.println("Meinstansiasi kelas D");
        D kelasD = new D(); //Perhatikan sintaks ini
    }

}
