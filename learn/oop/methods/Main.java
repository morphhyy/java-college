class Main{
    String name(){
        return "morphy";
    }

    public static int age(){
        return 21;
    }


    public static void main(String[] args){
        Main p = new Main();
        System.out.println(p.name());
        
        //static can be accessed without creating an objects
        System.out.println(age());
    }
}