package com.ioan;

/**
 * Created by Nelutzu on 3/26/2017.
 */
public class Player {
    public String name;
    public  int health;
    public  String weapon;

    public void loseHealth (int demange){
        this.health = this.health -demange;
        if(this.health <=0){
            System.out.println("Player knocked out");
        }

    }
    public int healtRemaining (){
        return this.health;
    }


}
