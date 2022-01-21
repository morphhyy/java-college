class Language {
    public void message(){
        System.out.println("Hello...");
    }
}

class Java extends Language {
    public void message(){
        System.out.println("Hello from Java");
    }
}

class Python extends Language {
    public void message(){
        System.out.println("Hello from Python");
    }
}

class Main {
    public static void main(String[] args){
        Java p1 = new Java();
        Python p2 = new Python();

        p1.message();
        p2.message();
    }
}