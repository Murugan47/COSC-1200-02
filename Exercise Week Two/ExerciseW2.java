import java.util.Scanner;

public class ExerciseW2 {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        // First Exercsie Problem
        System.out.println("Enter the first number");
        float first = inputScanner.nextFloat();

        System.out.println("Enter the second number");
        float second = inputScanner.nextFloat();

        System.out.println("Enter the third number");
        float third = inputScanner.nextFloat();

        System.out.println( "The Maximum of three numbers is " + Math.max(first, Math.max(second, third)));

        // Second Exercise Problem

        System.out.println("Input a number and ill tell you if its odd or even");
        int number = inputScanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " Is even");
        } else {
            System.out.println(number + " Is odd");
        }

        // Third Exercise Problem

        System.out.println("Enter a whole number, this will be the position in the fibonacci sequence you want");
        int position = inputScanner.nextInt();

        int i = 0;
        int first_number = 0;
        int second_number = 1;
        int fibonacci_number = 0;

        while (i < position) {

            fibonacci_number = first_number + second_number;
            second_number = first_number;
            first_number = fibonacci_number;
            i++;

        }

        System.out.println("This number position " + position + " in the fibonacci sequence is " + fibonacci_number);

    }

}