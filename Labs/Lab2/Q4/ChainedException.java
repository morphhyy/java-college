//WAP to demonstrate the use of chained Exception.

import java.io.IOException;

class ChainedException
{
    public static void main(String[] args)
    {
        try{
            ArithmeticException e = new ArithmeticException("Arithmetic Exception");
            e.initCause(new IOException("This is the cause of Arithmetic Exception"));
            throw e;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
