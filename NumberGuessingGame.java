import java.util.Scanner;

public class NumberGuessingGame {

public static void  guessingNumer() {
    Scanner sc = new Scanner(System.in);

    // Generate a random number between 1 and 100
    int number = 1 + (int) (100 * Math.random());   
    // Number of attampt
    int k = 5;

    System.out.println(" you guessed number between 1 to 100 ");
    System.out.println(" you have " + k + "attempts to the correct number  ");

    for (int i = 1; i <= k; i++) {
        System.out.println(" Enter the guessing number attempt = " + i );
        int guess = sc.nextInt();
        if (guess == number) {
            System.out.println(" Congratulations ! you guessed the number  ");
            sc.close();
            //  Exit you guessed the number
            return;

        } else if (guess < number) {
            System.out.println("The number is greater than you guessed the number  " + guess);

        } else {
            System.out.println("  The number is less then you guessed number " + guess);
        }
    }
            System.out.println(" The have exhausted all attempts. The correct number was:" + number);
            sc.close();


    }


    public static void main(String[] args) {
        guessingNumer();
    }

}
