package com.ioan;

/**
 * Created by Nelutzu on 4/2/2017.
 */
public class MathEquation {

    private double leftVal;
    private double rightVal;
 //   private double opCode;
    private double opCode = 'a';
    private double result;


    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public double getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getResult() {
        return result;
    }
    public MathEquation() {}

    //Cream un Constructori
    public  MathEquation (char opCode){
        this.opCode=opCode;
    }
    public MathEquation (char opCode , double leftVal , double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }


    public void execute() {
        switch ((int) opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;


        }
    }
}






