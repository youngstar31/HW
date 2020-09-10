import java.util.Scanner;

public class Homework10 {
//10) Create a method that calculates the circumference of a circle

    public static double calcCircumOfACircle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a radius");
        double userInput1 = scan.nextInt();

        return 2 * Math.PI * userInput1;


    }

    public static void main(String[] args) {
        System.out.println(calcCircumOfACircle());
    }




}
