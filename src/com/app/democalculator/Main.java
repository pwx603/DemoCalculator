package com.app.democalculator;

public class Main {

    public static void main(String[] args) {
//        MathEquation testEquation = new MathEquation();
//        testEquation.execute();
//        System.out.print("test= ");
//        System.out.println(testEquation.getResult());

        MathEquation[] equations = new MathEquation[4];

        equations[0] = new MathEquation(100.0d, 50.0d, 'd');
        equations[1] = new MathEquation(25.0d, 92.0d, 'a');
        equations[2] = new MathEquation(255.0d, 17.0d, 's');
        equations[3] = new MathEquation(11.0d, 3.0d, 'm');


        for(MathEquation equation: equations){
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

    }

}
