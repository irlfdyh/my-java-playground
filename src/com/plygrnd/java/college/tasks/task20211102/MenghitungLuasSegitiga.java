package com.plygrnd.java.college.tasks.task20211102;

import java.util.Scanner;

/**
 * Menghitung luas segitiga
 */
public class MenghitungLuasSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program menghitung luas segitiga\n");
        System.out.print("Masukkan alas: ");
        int alas = scanner.nextInt();
        System.out.print("Masukkan tinggi: ");
        int tinggi = scanner.nextInt();;
        System.out.println("Luas segitiga adalah: " + (alas * tinggi) / 2);
    }
}