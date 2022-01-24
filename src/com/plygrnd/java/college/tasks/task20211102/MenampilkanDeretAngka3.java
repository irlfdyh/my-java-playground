package com.plygrnd.java.college.tasks.task20211102;

/**
 * Menampilkan deret angka 1 2 3 4 5 6 7 8 9 10 55
 */
public class MenampilkanDeretAngka3 {
    public static void main(String[] args) {
        System.out.println("Menampilkan deret angka menggunakan looping (do while)");
        int i = 1;
        do {
            if (i == 11) {
                i *= 5;
            }
            System.out.print(i + " ");
            i++;
        } while (i <= 11);
    }
}