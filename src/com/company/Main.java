package com.company;

import java.util.Scanner;

public class Main {

    static float a;
    static float b;

    public static void main(String[] args) {
        nuskaitymas();

        System.out.println("Jusu vidurkis");

        System.out.println(skaiciavimas());

    }

    public static void nuskaitymas() {
        System.out.println("Sveiki, iveskite nuvaziuotus km");

        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();

        System.out.println("Iveskite sunaudotu degalu kieki");

        b = sc.nextFloat();
    }


    public static float skaiciavimas() {
        return b * (100 / a);
    }



}
