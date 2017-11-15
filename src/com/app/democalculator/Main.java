package com.app.democalculator;

public class Main {

    public static void main(String[] args) {
        double[] leftvals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightvals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'a', 's', 'd', 'm'};
        double[]results = new double[opCodes.length];

//	    double val1 = 100.0d;
//	    double val2 = 0d;
//        double result;

//        char opCode = 'd';

        for(int i = 0; i < opCodes.length; i++){
            switch (opCodes[i]){
                case 'a':
                    results[i] = leftvals[i] + rightvals[i];
                    break;
                case 's':
                    results[i] = leftvals[i] - rightvals[i];
                    break;
                case 'd':
                    results[i] = (rightvals[i]!=0.0d)? leftvals[i]/rightvals[i]:0.0d;
                    break;
                case 'm':
                    results[i] = leftvals[i] * rightvals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0d;
                    break;

            }

        }


        for(double theResult: results){
            System.out.println(theResult);
        }


    }
}
