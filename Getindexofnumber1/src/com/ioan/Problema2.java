package com.ioan;

/**
 * Created by Nelutzu on 3/31/2017.
 */
public class Problema2 {

//    Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
//    int n = 20; //sau o alta valoare

 public static void getSum(int n)
 {
     int sum =0;
     for (int i=0 ; i <= n ; i++) {

         sum += i;
     }
     System.out.println(sum);
 }

}
