package com.ioan;

import java.util.Scanner;

/**
 * Created by Nelutzu on 3/24/2017.
 */
public class NuAsa {


    private  int nr1;
    private  int nr2;
    {
        nr1 = 0;
        nr2 = 0;
    }

    public void findCommonDivisor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first nr:");
        nr1 = sc.nextInt();
        System.out.println("Enter the second nr:");
        nr2 = sc.nextInt();



        int hcf = 1;
        int i = 2;
        while (i <= nr1 && i <= nr2 ) {
            if (nr1 % i == 0 && nr2 % i == 0) {
                hcf = i;

            }
            i++;
        }
        System.out.println("the highest common factor for " + nr1 + " , " + nr2 + " and is " + hcf);
        int numarator = nr1/hcf;
        int numitor = nr2/hcf;
        System.out.println("num is " + numarator + " and numitor is " + numitor);
    }
}
