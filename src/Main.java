import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int playerGuess;
        int numberOfTasks;
        int points = 0;
        int numberOne;
        int numberTwo;
        char[] mathSymbols = {'+', '-', '*', '/'};

        System.out.print("\nPlease give number of tasks: ");
        numberOfTasks = scanner.nextInt();

        for (int i = 0; i < numberOfTasks; i++) {
            numberOne = random.nextInt(10);
            numberTwo = random.nextInt(10);
            System.out.printf("Please give result of: %d + %d = ", numberOne, numberTwo);
            playerGuess = scanner.nextInt();
            if (playerGuess == (numberOne + numberTwo)) {
                System.out.println("Great!");
                points++;
            }
        }

        System.out.printf("\nYour final score is %d of %d",points, numberOfTasks);





    }

}
