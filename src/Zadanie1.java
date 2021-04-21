import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        int numberToGuess = new Random().nextInt(100);
        int counter = 5;

        do {
            System.out.println("To start guessing number please insert integer between 0 and 99.");

            Scanner userInteger = new Scanner(System.in);
            int userValue = userInteger.nextInt();
            System.out.println("Integer inserted by user is: " + userValue);
            counter--;

            //User value verification
            if (userValue > numberToGuess) {
                System.out.println("Your number is GREATER than the one you are trying to guess.");
            } else if (userValue < numberToGuess) {
                System.out.println("Your number is LOWER than the one you are trying to guess.");
            } else if (userValue == numberToGuess) {
                System.out.println("You guessed it!");
                break;
            }

            //Counter verification
            if (counter > 0) {
                System.out.println("Number of remaining attempts: " + counter + ". Please try again. \n");
            } else if(counter == 0){
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                break;
            }
        } while (counter > 0);
    }
}



