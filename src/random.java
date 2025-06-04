import java.util.Random;
import java.util.Scanner;

public class random {

    public static void main(String[] args) {

        final var randomNumber = new Random();
        final var scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Guess what the system might output");
            System.out.println("========================");
            System.out.println("\n");
            System.out.print("Enter a number between 1 and 10: ");

            int enteredInput;
            try {
                enteredInput = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.print("insert a number bro WTF ---- ");
                scanner.nextLine();
                continue;
            }

            if ( enteredInput < 1 || enteredInput > 10) {
                System.out.println("now you adding numbers with that range try again boss");
                System.out.println("\n");
                continue;
            }

            System.out.println("The number you picked is: " + enteredInput);

            final var systemNumber = randomNumber.nextInt(10) + 1;

            if (enteredInput == systemNumber) {
                System.out.println("Congratulations! You guessed it right.");
                break;
            }

            System.out.println("The System picked: " + systemNumber + " you have failed");
            System.out.println("Try again?");
            System.out.println("Yes to retry and No to exit the game");
            final var userYesNo = scanner.nextLine();

            if (userYesNo.equalsIgnoreCase("No")) {
                System.out.println("I see you done you little mango");
                break;
            } else if (!userYesNo.equalsIgnoreCase("Yes")) {
                System.out.println("\n");
                System.out.println("what the f*ck did you just enter? try that again");
            }
        }
        scanner.close();
    }
}

