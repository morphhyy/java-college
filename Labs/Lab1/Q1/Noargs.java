public class Noargs {
    String name;

    Noargs(){
        name = "Ram";
    }

    public static void main(String[] args){
        Noargs P = new Noargs();
        System.out.println("My name is " + P.name);
    }
}