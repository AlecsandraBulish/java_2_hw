package ru.geekbrains.java2.flows;

import java.lang.reflect.GenericDeclaration;

public class Time {
    static final int size = 10000000;
    static final int h = size/2;
    static float arr[] = new float[size];
    static final int n = 1;
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
        countTime(arr);
        countTimeTwoThreads(arr);
        System.out.println("end");
    }

    static void countTime(float arr[]) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    static void countTimeTwoThreads(float arr[]) {
        long a = System.currentTimeMillis();
        float mass1 [] = new float[h];
        float mass2 [] = new float[h];
        Thread t1 = new Thread(() -> {
            System.arraycopy(arr,0, mass1,0, h);
            for (int i = 0; i < mass1.length; i++) {
                mass1[i] = (float)(mass1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.arraycopy(mass1, 0, arr, 0, h);
        });
        Thread t2 = new Thread(() -> {
            System.arraycopy(arr, h, mass2, 0, h);
            for (int i = 0; i < mass2.length; i++) {
                mass2[i] = (float)(mass2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.arraycopy(mass2, 0, arr, h, h);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - a);
    }

}
