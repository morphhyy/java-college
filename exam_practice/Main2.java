public class Main2 {
    String name, post;
    int id;
    double salary;
    Main(String name, int id, double salary, String post){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.post = post;
    }

    public String toString(){
        return this.name + " " + this.id + " " + this.salary + " " + this.post;
    }

    public static void main(String[] args){
        Main2 obj = new Main2("Niraj", 12, 2500.23, "CEO");
        System.out.println(obj);
    }
}
