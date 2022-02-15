package com.plygrnd.java.college.tasks.task20220215;

import java.util.Scanner;

public class Soal2 {

    private double panjang;
    private double lebar;
    private static double luas;
    private static double keliling;

    public void setPanjang(Double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(Double lebar) {
        this.lebar = lebar;
    }

    public void getLuas() {
        luas = this.panjang * this.lebar;
    }

    public void getKeliling() {
        keliling =  2 * (this.panjang + this.lebar);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Soal2 clazzRef = new Soal2();

        System.out.print("setPanjang                : ");
        clazzRef.setPanjang(scanner.nextDouble());
        System.out.print("setLebar                  : ");
        clazzRef.setLebar(scanner.nextDouble());
        clazzRef.getLuas();
        System.out.println("Luas Persegi Panjang      : " + luas);
        clazzRef.getKeliling();
        System.out.println("Keliling Persegi Panjang  : " + keliling);

    }

}
