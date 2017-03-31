package com.ioan;

/**
 * Created by Nelutzu on 3/27/2017.
 */
public class MathEquasion {
    public double leftV;
    public double rightV;
    public char opCodes;
    public double result;

    public void execute(){
        switch(opCodes){
            case 'a':
                result = leftV+rightV;
                break;
            case 's':
                result = leftV-rightV;
                break;
            case 'd':
                result = rightV  ! = 0.0d ? leftV / rightV : 0.0d;
                break;
            case 'm':
                result = leftV * rightV;
                break;
            default:
                 System.out.println("Error -invalid opCode");
             result=0.0d;
             break;


        }

    }



}
