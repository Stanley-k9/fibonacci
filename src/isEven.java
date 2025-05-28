import java.util.Scanner;

// This will check if the entered number is odd or even
public class isEven {
    public static void main(String[] args) {
        
        final var input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int mango = input.nextInt();

        String answer = "even";
        if(mango % 2 != 0) {
            answer = "odd";
        }

        System.out.print("The number you entered is an " + answer + " number");
    }
}