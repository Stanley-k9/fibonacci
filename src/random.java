import java.util.Random;
import java.util.Scanner;

public class random {

    public static void main(String[] args) {

        final var randomNumber = new Random();


        for (int i = 0; i <= 10; i++) {
            System.out.println("Guess what the system might output");
            System.out.println("========================");
            System.out.println("\n");
            System.out.print("Enter a number: ");
            final var userInput = new Scanner(System.in);
            int enteredInput = userInput.nextInt();

            System.out.println("The number you picked is: " + enteredInput);

            final var systemNumber = randomNumber.nextInt(10) + 1;

            if (enteredInput != systemNumber) {
                System.out.println("The System picked: " + systemNumber + " you have failed");
                System.out.println("Try again?");
                System.out.println("Yes to retry and No to exit the game");
                final var yesno = new Scanner(System.in);
                final var userYesNo = yesno.nextLine();

                if (userYesNo.equalsIgnoreCase("No")) {
                    return;
                } else if (!userYesNo.equalsIgnoreCase("Yes")) {
                    System.out.println("\n");
                    System.out.println("what the f*ck did you just enter? try that again");
                } else {
                    continue;
                }
            } else {
                System.out.println("Congratulations! You guessed it right.");
                return;
            }
        }
    }
}

