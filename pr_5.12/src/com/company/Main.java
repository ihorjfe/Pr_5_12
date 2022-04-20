package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[99];
        for (int i = 1, j = 0; i <= 99; i = i + 2, j++) {
            array[j] = i;
        }
        System.out.println();
        for (int i = 0; i < 50; i++)
            System.out.print(array[i]+ " ");
    }
}
