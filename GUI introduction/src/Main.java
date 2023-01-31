import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
      String name= JOptionPane.showInputDialog("Enter your name");
      JOptionPane.showMessageDialog ("hello" name);

      int age = Integer.parseInt(JOptionPane.showMessageDialog("enter your age"));
      JOptionPane.showMessageDialog("you are:" + age + "years old");

    }
}