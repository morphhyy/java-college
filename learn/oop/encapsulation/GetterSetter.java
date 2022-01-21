class Person {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class GetterSetter {
    public static void main(String[] args){
        Person p = new Person();
        p.setName("morphy");
        System.out.println("Name: " + p.getName());

    }
}