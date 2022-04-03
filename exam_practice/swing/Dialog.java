package swing;

import javax.swing.*;

class Dialog extends JFrame{

  Dialog() {
    String num1 = JOptionPane.showInputDialog(this, "Enter first number:");
    Double number1 = Double.parseDouble(num1);

    String num2 = JOptionPane.showInputDialog(this, "Enter second number:");
    Double number2 = Double.parseDouble(num2);

    Double res = number1 + number2;
    JOptionPane.showMessageDialog(this, "Sum is: " + res);
  }

  public static void main(String[] args) {
    new Dialog();
  }

}