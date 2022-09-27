package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte počet padesáti korun");
        int a = sc.nextInt();
        System.out.println("Zadejte počet dvaceti korun");
        int b = sc.nextInt();
        System.out.println("Zadejte počet deseti korun");
        int c = sc.nextInt();
        System.out.println("Zadejte počet pěti korun");
        int d = sc.nextInt();
        System.out.println("Zadejte počet dvou korun");
        int e = sc.nextInt();
        System.out.println("Zadejte počet korun");
        int f = sc.nextInt();
        System.out.println("právě máte:->");
        int x = a * 50 + b * 20 + c * 10 + d * 5 + e * 2 + f;
        System.out.println(x);
        System.out.println("Zadejte potřebný obnos peněz:");
        int g = sc.nextInt();


        if (x > g) {
            System.out.println("Máš dostatek peněz a po zaplacení ti zbyde:");
            System.out.println(x - g);
        } else if (x == g) {
            System.out.println("Máš na korunu přesně na zaplacení");

        } else {
            System.out.println("nemáš dostatek peněz, chybí ti:");
            System.out.println(g - x);
        }
        System.out.println("Korun");
    }
}