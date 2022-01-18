class Base {
    public void display() {
        System.out.println("Hello World");
    }
}

class Parent extends Base {
    @Override
    public void display() {
        System.out.println("Just Override the Base Class Method");
    }
}

class Overriding {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.display();
    }
}