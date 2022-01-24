package com.plygrnd.java.college.tasks.task20211102;

import java.util.Scanner;

/**
 * Menentukan letak kuadran dari titik koordinat x dan y
 */
public class MenentukanLetakKuadran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program untuk menentukan letak kuadran\n");
        System.out.print("Masukkan koordinat x: ");
        int koordinatX = scanner.nextInt();
        System.out.print("Masukkan koordinat y: ");
        int koordinatY = scanner.nextInt();

        if (koordinatX >= 0 && koordinatY >= 0) {
            System.out.println("titik berada di KUADRAN I");
        } else if (koordinatX < 0 && koordinatY >= 0) {
            System.out.println("titik berada di KUADRAN II");
        } else if (koordinatX < 0) {
            System.out.println("titik berada di KUADRAN III");
        } else {
            System.out.println("titik berada di KUADRAN IV");
        }
    }
}