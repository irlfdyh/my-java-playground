package com.plygrnd.java.college.tasks.task20220118;

public class MethodAndConstructorOverloadingTask {

    MethodAndConstructorOverloadingTask() {
        System.out.println("1. konstruktor kosong diinstansiasi terlebih dahulu");
    }

    MethodAndConstructorOverloadingTask(int a, int b) {
        System.out.println("2. lalu menginstansiasi konstruktor integer");
    }

    MethodAndConstructorOverloadingTask(double x, double y) {
        this(5, 4);
        System.out.println("3. lalu menginstansiasi konstruktor double");
    }

    public static void main(String[] args) {

        System.out.println("Urutan pemanggilan konstruktor: ");

        MethodAndConstructorOverloadingTask reference1 = new MethodAndConstructorOverloadingTask();
        MethodAndConstructorOverloadingTask reference2 = new MethodAndConstructorOverloadingTask(0.2, 0.5);

    }

}
