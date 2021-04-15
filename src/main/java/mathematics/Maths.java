package mathematics;

import exceptions.MathsExceptions;
import exceptions.MathsExceptions;
import interfaces.IMaths;

public class Maths implements IMaths {

    @Override
    public int addition(int a, int b){
        return a+b;
    }

    @Override
    public int soustraction (int a, int b){
        return a-b;
    }

    @Override
    public int multiplication (int a, int b){
        return a*b;
    }

    @Override
    public double division (int a, int b) throws MathsExceptions {
        if (b == 0) {
            throw new MathsExceptions("Divisions par zero impossible");
        }

        try {
            return a/b;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            throw new MathsExceptions(e.getMessage());
        }
    }
}
