package com.ioan;

public class Main {

    public static void main(String[] args) {
	// write your code here
double[] values ={81, 52 ,33, 95, 18, 4, 7};
double largest=values[0];
//double smallest=values [0]'
for (int i=0 ; i< values.length; i++){
    if (values[i]> largest){
        //if (values[i]< smallest){
        largest= values[i];
    }
}
        System.out.println(largest);
    }
}
