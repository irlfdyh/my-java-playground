package com.plygrnd.java.college.tasks.task20211102;

import java.util.Scanner;

/**
 * Menentukan bilangan ganjil atau genap
 */
public class MenentukanBilanganGanjilAtauGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program untuk menentukan bilangan ganjil atau genap\n");
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " merupakan bilangan GENAP");
        } else {
            System.out.println(bilangan + " merupakan bilangan GANJIL");
        }
    }
}