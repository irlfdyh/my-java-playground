package com.plygrnd.java.tasks.task11022021;

import java.util.Scanner;

/**
 * Menghitung luas persegi panjang
 */
public class MenghitungLuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program menghitung luas persegi panjang\n");
        System.out.print("Masukkan panjang: ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = scanner.nextInt();
        System.out.println("Luas persegi panjang adalah: " + panjang * lebar);
    }
}