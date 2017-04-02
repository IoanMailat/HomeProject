package com.ioan;


// abstract class  e foarte utila pt polimorfism si mostenire
    //nu se pot crea obicte din clasa abstracta
    // tuna si potpie sunt clase Concrete
    //
 abstract public class Food {

    //     void eat (){
//
//        System.out.println("This food is great");
// daca metoda e  abstracta si clasa e abstracata neaparat ,dar
// clasa poate sa fie abstracta iar metodele nu neaparat abstracte
    //metodene astracte nu au nevoie de body;
    //metodele neabstracte trebuie sa detina un body;
    //daca superclasa are metode abstracte,sublclasele trebuie sa folosasca metodele abstracte;
    public abstract void eat();
}

