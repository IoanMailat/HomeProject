package com.ioan;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int intArray[] = new int[]{1, 100, 20, 30, 50};

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int number : intArray) {
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println(largest);
        for (int number : intArray) {
            if (number < smallest) {
                smallest = number;
            }
        }
            System.out.println(smallest);
        }
    }

