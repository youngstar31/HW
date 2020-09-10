import java.util.Scanner;

public class Homework1 {
    public static void loggingIn(){

        int attempts = 1;

        String greeting = "Hello, type in your password";
        System.out.println(greeting);

        String validPw = "Grateful8";


        boolean indicator = false;

        Scanner pwScan = new Scanner(System.in);



        while(indicator == false){

            String userInput = pwScan.nextLine();


            if (userInput.equals(validPw)){
                System.out.println("You are logged in");

                indicator = true;
            }

            else {
                System.out.println("Invalid Password, Try Again");
                System.out.println("Attempts: " + attempts);
                attempts++;



            }


        }


    }

    public static void main(String[] args) {
        loggingIn();
    }

}
