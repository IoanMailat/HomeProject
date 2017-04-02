package com.ioan;

public class Main {

    public static void main(String[] args) {
        // Intoduction to Polymorphism
//    Food1 bucky[]= new Food1[2];
//    bucky[0]= new Potpie();
//    bucky[1]= new Tuna();
//
//    for (int i=0; i<2 ;i++){
//        bucky[i].eat();
//    }
//
//    }
       //Polymorphic Arguements
            Fatty bucky1 = new Fatty();
            Food1 fo = new Food1();
            Food1 po = new Potpie();


            bucky1.digest(fo);
            bucky1.digest(po);


        }
    }

