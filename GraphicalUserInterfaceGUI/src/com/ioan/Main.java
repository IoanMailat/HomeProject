package com.ioan;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String fn = JOptionPane.showInputDialog(" Enter  first number ");
        String sn = JOptionPane.showInputDialog(" Enter  second number ");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;

        JOptionPane.showMessageDialog( null ," The answer is " + sum , "MailatCalc" , JOptionPane.PLAIN_MESSAGE);

    }
}
