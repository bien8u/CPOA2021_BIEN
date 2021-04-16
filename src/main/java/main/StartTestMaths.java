package main;

import exceptions.MathsExceptions;
import interfaces.IMaths;
import mathematics.Maths;

public class StartTestMaths {

    public static void main(String[] args) throws MathsExceptions {
        IMaths maths = new Maths();
        System.out.println("Résultat addition : \n"+maths.addition(2,3));
        System.out.println("Résultat soustraction : \n"+maths.soustraction(2,3));
        System.out.println("Résultat multiplicationV1 : \n"+maths.multiplicationV1(2,3));
        System.out.println("Résultat multiplicationV2 : \n"+maths.multiplicationV2(2,3));
        System.out.println("Résultat division : \n"+maths.division(2,3));
    }
}
