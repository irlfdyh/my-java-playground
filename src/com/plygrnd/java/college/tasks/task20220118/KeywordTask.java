package com.plygrnd.java.college.tasks.task20220118;

import java.util.Scanner;

/**
 * Rumus luas       : P x L
 * Rumus keliling   : 2 x (P + L)
 */
public class KeywordTask {

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
        KeywordTask keywordTask = new KeywordTask();

        System.out.print("setPanjang                : ");
        keywordTask.setPanjang(scanner.nextDouble());
        System.out.print("setLebar                  : ");
        keywordTask.setLebar(scanner.nextDouble());
        keywordTask.getLuas();
        System.out.println("Luas Persegi Panjang      : " + luas);
        keywordTask.getKeliling();
        System.out.println("Keliling Persegi Panjang  : " + keliling);

    }

}
