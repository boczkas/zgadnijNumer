import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 1000);

        System.out.println("Lets play random number!\nEnter first number:");
        Scanner in = new Scanner(System.in);
        int guessedNumber = in.nextInt();

        while (guessedNumber != randomNumber) {

            if (guessedNumber > randomNumber) {
                System.out.println("This number is bigger than the random number.");
            } else {
                System.out.println("This number is smaller than the random number.");
            }
            System.out.println("Try again, enter new number!");
            guessedNumber = in.nextInt();
        }

        System.out.println("Congratulation you've guessed the secret number! " + guessedNumber);
    }
}
