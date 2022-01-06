import java.lang.Exception;

class MyException extends Exception
{
    public MyException()
    {
        super("This is my exception");
    }
}