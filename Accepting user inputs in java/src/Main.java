import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner john = new Scanner(System.in);

        System.out.println("what is your name");
        String name= john.nextLine();
        System.out.println("how old are you?");
        int age = john.nextInt();
        john.nextLine();
        System.out.println("what is your favourite food");
        String food = john.nextLine();
        System.out.println("hey" + name);
        System.out.println(" you are" + age + "years old");
        System.out.println("you like:" +food);
    }
}