package mathematics;

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
    public int multiplicationV1 (int a, int b){
        return a*b;
    }

    @Override
    public int multiplicationV2(int a, int b) {
        int res   = 0;
        int temp  = 0;
        int signe = 1;
        if (a<0 & b<0){a=a*-1; b=b*-1;}
        if (a<0){a=b*-1; signe = -1;}
        if (b<0){b=b*-1; signe = -1;}
        while(temp != b){
            temp++;
            res = addition( res, a);}
        return res*signe;
    }

    @Override
    public double division (double a, double b) throws MathsExceptions {
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
