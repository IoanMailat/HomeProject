package com.ioan;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer printer = new Printer(50,true);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was "+ pagesPrinted + " new total pages " + printer.getPagesPrinted());
    }
}