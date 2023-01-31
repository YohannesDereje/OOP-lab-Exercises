public class Main {
    public static void main(String[] args) {
        String x = "water";
        String y= "kool aid";
        String temp;

        temp =x;
        x=y;
        y= temp;

        y=x;

        System.out.println("x :" + x);
        System.out.println("y :" +y);
    }
}