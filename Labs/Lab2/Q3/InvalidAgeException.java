// Create your own exception class called InvalidAgeException which is thrown if the given age is less than 1 and greater than 100.
import java.lang.Exception;

class InvalidAgeException extends Exception
{
    public InvalidAgeException()
    {
        super("Invalid Age: Age should be between 1 to 100");
    }
}