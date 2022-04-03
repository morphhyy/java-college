package exam;

interface Test {
    void run();
} 

interface Test2 {
    void close();

    default void run2(){
        System.out.println("Hello");
    }
}


public class InterfaceSample implements Test, Test2{
    public void run(){
        System.out.println("Running");
    }

    public void close(){
        System.out.println("Closing");
    }
    public static void main(String args[]){
        InterfaceSample o = new InterfaceSample();
        o.run();
        o.close();
        o.run2();
    }
    
}
