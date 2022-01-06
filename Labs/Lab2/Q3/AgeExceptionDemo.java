class AgeExceptionDemo
{
    public static void main(String[] args)
    {
        int age = 101;
        try{
            if(age<1 || age>100){
                throw new InvalidAgeException();
            }
        }catch(InvalidAgeException e){
                System.out.println(e.getMessage());
        }
    }
}