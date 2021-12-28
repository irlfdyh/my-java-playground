package com.plygrnd.java.college.tasks.task11022021;

import java.util.Scanner;

/**
 * Menghitung luas persegi
 */
public class MenghitungLuasPersegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program menghitung luas persegi\n");
        System.out.print("Masukkan sisi persegi: ");
        int sisi = scanner.nextInt();
        System.out.println("Luas persegi adalah: " + sisi * sisi);
    }
}