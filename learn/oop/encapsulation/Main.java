class Area {
    int length;
    int breadth;

    Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea(){
        System.out.println(length * breadth);
    }
}

class Main{
    public static void main(String[] args){
        Area rec = new Area(1,2);
        rec.getArea();
    }
}