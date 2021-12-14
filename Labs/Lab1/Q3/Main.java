abstract class Message {

  public void display() {
    System.out.println("Hello, I'm from Nepal.");
  }
}

class Main extends Message {

  public static void main(String[] args) {

    Main obj = new Main();

    obj.display();
  }
}