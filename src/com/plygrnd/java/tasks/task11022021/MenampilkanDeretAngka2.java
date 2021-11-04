package com.plygrnd.java.tasks.task11022021;

/**
 * Menampilkan deret angka 50 45 40 35 30 25 20 15 10 5 menggunakan looping
 */
public class MenampilkanDeretAngka2 {
    public static void main(String[] args) {
        System.out.println("Menampilkan deret angka menggunakan looping (while)");
        int i = 50;
        while (i >= 5) {
            System.out.print(i + " ");
            i -= 5;
        }
    }
}