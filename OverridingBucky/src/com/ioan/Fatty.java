package com.ioan;

/**
 * Created by Nelutzu on 4/2/2017.
 */
public class Fatty {

    // Food fo = new Food(); nu merge pt ca Fldd class are restrictionata crearea de obicete fiind clasa abstracta;
    //dar putem sa folosim urmatoarea,clasa tuna si potpie neavand restructii
    //Food fo = new Tuna();

    public void digest (Food x){

        x.eat();
    }
}
