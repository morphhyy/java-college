abstract class Book{
    public String bookType;
    private String name, author, publisher;
    private int total_page;

    Book(String name, String author, int total_page, String bookType, String publisher) {
        this.name = name;
        this.total_page = total_page;
        this.author = author;
        this.publisher = publisher;
        this.bookType = bookType;
    }

    public String getType(){
        return this.bookType;
    }

    abstract void getBookType();

}

class Novel extends Book{
    Novel(){
        super("Cruel World", "None", 700, "Fiction", "Me");
    }

    public void getBookType(){
        System.out.println(bookType);
        // System.out.println("Book Type: " + getType());
    }

}

class Magazine extends Book{
    Magazine(){
        super("Naruto", "Boesd", 700, "NonFiction", "Our");
    }
    
    public void getBookType(){
        System.out.println("Book Type: " + getType());
    }

}

class Main {
    public static void main(String[] args){

        Novel n = new Novel();
        Magazine m = new Magazine();
        n.getBookType();
        m.getBookType();
    }
}