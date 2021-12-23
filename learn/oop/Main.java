class Main {
    public int add(int a, int b) {
      int sum = a + b;
      return sum;
    }
  
    public static void main(String[] args) {
      
      int num1 = 20;
      int num2 = 10;
  
      Main obj = new Main();
      int result = obj.add(num1, num2);
      System.out.println("Sum: " + result);
    }
  }