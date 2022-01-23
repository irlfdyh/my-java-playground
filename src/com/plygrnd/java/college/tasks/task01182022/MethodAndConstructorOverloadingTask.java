package com.plygrnd.java.college.tasks.task01182022;

public class MethodAndConstructorOverloadingTask {

    MethodAndConstructorOverloadingTask() { }

    MethodAndConstructorOverloadingTask(int a, int b) { }

    MethodAndConstructorOverloadingTask(double x, double y) {
        this(5, 4);
    }

}
