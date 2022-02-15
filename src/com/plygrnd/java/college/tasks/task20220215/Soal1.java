package com.plygrnd.java.college.tasks.task20220215;

import com.plygrnd.java.college.tasks.task20211228.Irshal_10520058;

import java.util.Scanner;

public class Soal1 {

    public String[] numbers = new String[10];
    public String[] names = new String[10];
    public String[] classes = new String[10];

    private int index = 0;

    public void requireInsert(String number, String name, String clazz) {
        numbers[index] = number;
        names[index] = name;
        classes[index] = clazz;
        index += 1;
    }

    public void requirePrint() {
        if (index > 0) {
            for (int i = 0; i < index; i++) {
                System.out.println("NIM     :" + numbers[i]);
                System.out.println("Nama    :" + names[i]);
                System.out.println("Kelas   :" + classes[i]);
            }
        } else {
            System.out.println("Data masin kosong!");
        }
    }

    public void requireMenu() {
        System.out.println(" ==================== ");
        System.out.println("| 1. Input data      |");
        System.out.println("| 2. Tampil data     |");
        System.out.println("|--------------------|");
        System.out.println("| 3. Keluar aplikasi |");
        System.out.println(" ==================== ");
    }

    public static void main(String[] args) {
        Soal1 clazzRef = new Soal1();
        Scanner inputRef = new Scanner(System.in);
        String number;
        String name;
        String clazz;
        int opt;
        clazzRef.requireMenu();
        do {
            System.out.print("Pilih [0-2] : ");
            opt = inputRef.nextInt();
            inputRef.nextLine();
            switch (opt) {
                case 0 -> {
                    System.out.println("Keluar Aplikasi");
                }
                case 1 -> {
                    System.out.print("NIM   : ");
                    number = inputRef.nextLine();
                    System.out.print("Nama  : ");
                    name = inputRef.nextLine();
                    System.out.print("Kelas : ");
                    clazz = inputRef.nextLine();
                    clazzRef.requireInsert(number, name, clazz);
                }
                case 2 -> {
                    clazzRef.requirePrint();
                }
                default -> {
                    System.out.println("Pilihan tidak dikenali.");
                }
            }
        } while (opt != 0);
    }

}
