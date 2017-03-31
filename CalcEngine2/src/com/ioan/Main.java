package com.ioan;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //double[] leftV ={100.0d, 25.0d ,225.0d , 11.0d};
        //double[] rightV ={50.0d , 92.0d ,17.0d , 3.0d};
        //char[] opCodes = {'d' , 'a','s','m'};
        //double[] results = new double[opCodes.length];

        MathEquasion[] equasion = new MathEquasion[4];
        equasion[0] = create(100.0d, 50.0d, 'd');
        equasion[1] = create(25.0d, 92.0d, 'a');
        equasion[2] = create(225.0d, 17.0d, 's');
        equasion[3] = create(11.0d, 3.0d, 'm');

        //  for(int i=0 ; i< opCodes.length; i++)


        //for (double theResult: result)
        for (MathEquasion  equasion : equasion) {
            equasion.execute();
            System.out.print("result =");
            System.out.println(equasion.result);
        }
    }

    public static MathEquasion create(double leftV, double rightV, char opCodes) {
        MathEquasion equasion = new MathEquasion();
        equasion.leftV = leftV;
        equasion.rightV = rightV;
        equasion.opCodes = opCodes;
        return equasion;
    }
}


