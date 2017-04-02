package com.ioan;

import java.util.Scanner;

/**
 * Created by Nelutzu on 3/31/2017.
 */
public class Problema3 {
//    Se citesc numere naturale pânã când se introduce numãrul 0.
//    Afisati suma obtinutã prin adunarea doar a numerelor mai mari decat 4 si mai mici decat 11

    public static void getSum2()
    {
        Scanner sc = new Scanner(System.in);
    int sum3=0;
    int b;
        System.out.println("introducecti nr :");
        do {
            b = sc.nextInt();
            if (b > 4 && b < 11) {
                sum3 += b;
            }
        }while (b !=0);
        System.out.println("resultat" + sum3);
    }


}
