package com.ioan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal[] thelist = new Animal[2];
        Dog d = new Dog();
        Fish f = new Fish();

        thelist[0]= d;
        thelist[1]= f;

        for ( Animal x: thelist){
            x.noise();
        }
    }
}
