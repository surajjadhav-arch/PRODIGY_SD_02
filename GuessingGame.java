import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess the number between 1 to 100");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("Too High!");
            } else if (guess < randomNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct! You won 🎉");
                System.out.println("Total Attempts: " + attempts);
            }
        }
        sc.close();
    }
}
