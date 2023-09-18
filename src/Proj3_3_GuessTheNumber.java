import java.util.Scanner;
import java.util.Random;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;
        int myRandomGuess;
        int count = 0;
        Scanner keyboard = new Scanner(System.in);

        myRandomNumber = random.nextInt(100) + 1;//1-100

        do {
        System.out.println("Pick a number between 1-100");

        myRandomGuess = keyboard.nextInt();

        if(myRandomGuess == myRandomNumber){
            count++;
            System.out.println("Congratulations! You guessed the number in " + count + " guesses! Thanks for playing!");
        } else if (myRandomGuess < 1 || myRandomGuess > 100) {
            count++;
            System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive!");
        } else if (myRandomGuess > myRandomNumber) {
            count++;
            System.out.println("Your guess was too high");
        } else if (myRandomGuess < myRandomNumber) {
            count++;
            System.out.println("Your guess was too low");
        }
        }while(myRandomGuess != myRandomNumber);

    }


    }//end main

