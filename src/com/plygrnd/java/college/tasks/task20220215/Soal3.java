package com.plygrnd.java.college.tasks.task20220215;

public class Soal3 {

    Soal3() {
        System.out.println("1. konstruktor kosong diinstansiasi terlebih dahulu");
    }

    Soal3(int a, int b) {
        System.out.println("2. lalu menginstansiasi konstruktor integer");
    }

    Soal3(double x, double y) {
        this(5, 4);
        System.out.println("3. lalu menginstansiasi konstruktor double");
    }

    public static void main(String[] args) {

        System.out.println("Urutan pemanggilan konstruktor: ");

        Soal3 reference1 = new Soal3();
        Soal3 reference2 = new Soal3(0.2, 0.5);

    }

}
