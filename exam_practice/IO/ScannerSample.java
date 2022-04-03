package IO;
import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Full Name: ");
        String fullName = input.nextLine();
        System.out.println("My name is " + fullName);
        input.close();
    }
}
