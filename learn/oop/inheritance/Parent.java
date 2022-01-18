class Children {
    public void display() {
        System.out.println("Hello World");
    }
}

class Base extends Children {
    public void display() {
        // super keyword is used to class the method of parent class
        super.display();
        System.out.println("Hello From Base Class");
    }
    
    public void morning() {
        System.out.println("Good Morning");
    }
}

class Parent {
    public static void main(String[] args){
        Base b = new Base();
        b.display();
        b.morning();
    }
}