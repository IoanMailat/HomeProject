



package com.ioan;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      //Problema1
       System.out.println("Introduceti un numar pentru a verifica daca exista in sir");
        int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
       System.out.println(Problema1.getIndex(scanner.nextInt(),a));

     //Problema2
        System.out.println("Introduceti un numar pentru a calcula suma pana la acel numar");
        Problema2.getSum(scanner.nextInt());

      Problema3.getSum2();

    }
}
