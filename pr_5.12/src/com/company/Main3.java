package com.company;

public class Main3 {
    public static void main(String[] args) {
        System.out.print("Перший масив");
        System.out.println();
        int array[] = new int[10];
        int courent[] = new int[10];
        int Ihor[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + "");
        }
        System.out.println();
        System.out.print("Другий масив");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            courent[i] = (int) Math.round(Math.random() * 10);
            System.out.print(courent[i]);
        }
        System.out.println();
        System.out.print("Третій масив");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            Ihor[i]= array[i] + courent[i];
            System.out.print(Ihor[i]+" ");
        }
    }
}


