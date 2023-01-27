public class Main {
    class Main {
        public static void main(String[] args) {
            int number = 10;

            // checks if number is greater than 0
            if (number > 0) {
                System.out.println("The number is positive.");
            }

            // execute this block
            // if number is not greater than 0
            else {
                System.out.println("The number is not positive.");
            }

            System.out.println("Statement outside if...else block");
        }
    }
    // declaring double type variables
    Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

    // checks if n1 is greater than or equal to n2
    if (n1 >= n2) {

        // if...else statement inside the if block
        // checks if n1 is greater than or equal to n3
        if (n1 >= n3) {
            largest = n1;
        }

        else {
            largest = n3;
        }
    }  else {

        // if..else statement inside else block
        // checks if n2 is greater than or equal to n3
        if (n2 >= n3) {
            largest = n2;
        }

        else {
            largest = n3;
        }
    }

    System.out.println("Largest Number: " + largest);
    //Java Program to demonstrate the use of If else-if ladder.
    //It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.
    public class IfElseIfExample {
        public static void main(String[] args) {
            int marks=65;

            if(marks<50){
                System.out.println("fail");
            }
            else if(marks>=50 && marks<60){
                System.out.println("D grade");
            }
            else if(marks>=60 && marks<70){
                System.out.println("C grade");
            }
            else if(marks>=70 && marks<80){
                System.out.println("B grade");
            }
            else if(marks>=80 && marks<90){
                System.out.println("A grade");
            }else if(marks>=90 && marks<100){
                System.out.println("A+ grade");
            }else{
                System.out.println("Invalid!");
            }
        }
    }
    //Java Program to demonstrate the use of Nested If Statement.
    public class JavaNestedIfExample2 {
        public static void main(String[] args) {
            //Creating two variables for age and weight
            int age=25;
            int weight=48;
            //applying condition on age and weight
            if(age>=18){
                if(weight>50){
                    System.out.println("You are eligible to donate blood");
                } else{
                    System.out.println("You are not eligible to donate blood");
                }
            } else{
                System.out.println("Age must be greater than 18");
            }
            public class SwitchExample {
                public static void main(String[] args) {
                    //Declaring a variable for switch expression
                    int number=20;
                    //Switch expression
                    switch(number){
                        //Case statements
                        case 10: System.out.println("10");
                            break;
                        case 20: System.out.println("20");
                            break;
                        case 30: System.out.println("30");
                            break;
                        //Default case statement
                        default:System.out.println("Not in 10, 20 or 30");
                    }
                }
            }
        }

}