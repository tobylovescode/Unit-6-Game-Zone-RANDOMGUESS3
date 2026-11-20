import java.util.Random;
import java.util.Scanner;

public class RandomGuess3
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        int secretNumber = generator.nextInt(10) + 1;
        int guess = 0;
        int attempts = 0;
        System.out.println("Guess a number from 1 to 10.");
        System.out.println();

        while(guess != secretNumber)
        {
            System.out.println("Enter your guess >> ");
            guess = input.nextInt();

            attempts = attempts + 1;
            if(guess > secretNumber)
            {
                System.out.println("Try again! You're too high.");
            }
            else if(guess < secretNumber)
            {
                System.out.println("Try again! You're too low!");
            }
            else
            {
                System.out.println("You got it! :D");
            }
            System.out.println();
        }
        System.out.println("The number was " + secretNumber + "!");
        System.out.println("Attempt(s): " + attempts);
        input.close();
    }
}