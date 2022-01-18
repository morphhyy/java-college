class Base {
    public void display(){
        System.out.println("Hello World");
    }
}

class Main extends Base {
    public static void main(String[] args){
        Main my = new Main();
        my.display();
    }
}

