package com.ioan;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimension dimension = new Dimension(20,20,5);
        Case theCase= new Case("220B","Dell","240",dimension);

        Resolution nativeResolution= new Resolution(1600,1600);
        Monitor theMonitor = new Monitor("27 inch Best","acer",27,nativeResolution);

        Motherboard theMotherBoard= new Motherboard("bj-2000","asus",4,5,"v2.44");
        Pc thePC = new Pc(theCase, theMonitor, theMotherBoard);
        thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherboard().loadProgram("windows");
        thePC.getTheCase().pressPowerButton();

    }
    }

