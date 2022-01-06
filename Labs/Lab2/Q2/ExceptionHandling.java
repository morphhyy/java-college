//WAP to demonstrate Exception handling with all 5 keywords: try, catch, finally, throw and throws.
import java.lang.ArithmeticException;

class ExceptionHandling
{
    public static void main(String[] args) throws ArithmeticException 
    {
        try{
            System.out.println(5/0);   
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Bye Bye"); 
        }

        try{
            throw new MyException();
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}