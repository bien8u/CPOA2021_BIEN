package interfaces;

import exceptions.MathsExceptions;

public interface IMaths {
    int addition (int a, int b);

    int soustraction (int a, int b);

    int multiplicationV1 (int a, int b);

    int multiplicationV2 (int a, int b);

    double division (double a, double b) throws MathsExceptions;
}
