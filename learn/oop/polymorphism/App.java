class Pattern {
    public void display(){
        for(int i=0; i<10; i++){
            System.out.print("*");
        }
    }

    public void display(char c){
        for(int i=0; i<10; i++){
            System.out.print(c);
        }
    }
}

class App {
    public static void main(String[] args){
        Pattern p = new Pattern();
        p.display();
        System.out.println('\n');
        p.display('#');
    }
}


