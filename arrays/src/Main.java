public class Main {
    class Main {
        public static void main(String[] args) {

            int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
            int sum = 0;
            Double average;

            // access all elements using for each loop
            // add each element in sum
            for (int number: numbers) {
                sum += number;
            }

            // get the total number of elements
            int arrayLength = numbers.length;

            // calculate the average
            // convert the average from int to double
            average =  ((double)sum / (double)arrayLength);

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);
        }
    }
    //Java Program to return an array from the method
    class TestReturnArray{
        //creating method which returns an array
        static int[] get(){
            return new int[]{10,30,50,90,60};
        }

        public static void main(String args[]){
            //calling method which returns an array
            int arr[]=get();
            //printing the values of an array
            for(int i=0;i<arr.length;i++)
                System.out.println(arr[i]);
        }}
    //Java Program to demonstrate the case of
    //ArrayIndexOutOfBoundsException in a Java Array.
    public class TestArrayException{
        public static void main(String args[]){
            int arr[]={50,60,70,80};
            for(int i=0;i<=arr.length;i++){
                System.out.println(arr[i]);
            }
        }}
    //Java Program to demonstrate the case of
    //ArrayIndexOutOfBoundsException in a Java Array.
    public class TestArrayException{
        public static void main(String args[]){
            int arr[]={50,60,70,80};
            for(int i=0;i<=arr.length;i++){
                System.out.println(arr[i]);
            }
        }}
    //Java Program to illustrate the jagged array
    class TestJaggedArray{
        public static void main(String[] args){
            //declaring a 2D array with odd columns
            int arr[][] = new int[3][];
            arr[0] = new int[3];
            arr[1] = new int[4];
            arr[2] = new int[2];
            //initializing a jagged array
            int count = 0;
            for (int i=0; i<arr.length; i++)
                for(int j=0; j<arr[i].length; j++)
                    arr[i][j] = count++;

            //printing the data of a jagged array
            for (int i=0; i<arr.length; i++){
                for (int j=0; j<arr[i].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();//new line
            }
        }
    }
    //Java Program to copy a source array into a destination array in Java
    class TestArrayCopyDemo {
        public static void main(String[] args) {
            //declaring a source array
            char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                    'i', 'n', 'a', 't', 'e', 'd' };
            //declaring a destination array
            char[] copyTo = new char[7];
            //copying array using System.arraycopy() method
            System.arraycopy(copyFrom, 2, copyTo, 0, 7);
            //printing the destination array
            System.out.println(String.valueOf(copyTo));
        }
    }