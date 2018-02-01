package com.company;

import java.util.Scanner;

public class Main {
    private int sk;
    private int [] mas;
    public static void main(String[] args) {

        Main objektas = new Main();

        objektas.ivedimas();
        objektas.rezultatas();

    }
    public void ivedimas(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nurodykite kiek ketinate ivesti skaiciu: ");
        sk = in.nextInt();
        mas = new int[sk];
        for (int i = 0; i < sk; i++){
            System.out.println("Iveskite " +(i+1)+ " skaiciu");
            mas[i] = in.nextInt();
        }
    }
    public void rezultatas(){
        for (int i = 0; i < sk; i++){
            if (mas[i] > 100) {
                System.out.println(mas[i]);
            }
        }
    }
}
