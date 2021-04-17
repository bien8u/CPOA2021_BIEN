package exceptions;

import java.io.Serial;

public class MathsExceptions extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    public MathsExceptions(String message){
        super(message);
    }
}