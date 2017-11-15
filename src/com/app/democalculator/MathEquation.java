package com.app.democalculator;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = (rightVal != 0.0d) ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0d;
                break;

        }


    }

    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal){
        this.rightVal = rightVal;
    }

    public void setOpCode(char opCode){
        this.opCode = opCode;
    }

    public double getResult(){
        return this.result;
    }
}
