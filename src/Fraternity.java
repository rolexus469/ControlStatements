import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {

        char gender;
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("So you want to join a frat...Let's see if you meet the criteria");

        System.out.println("Enter your gender");
        gender = keyboard.next().charAt(0);

        if (gender == 'M'){
            System.out.println("Okay, that works");
            System.out.println("Enter your age");
            age = keyboard.nextInt();

            if (age >= 19){
                System.out.println("You meet the minimum age requirement, welcome to the frat");
            }
            else {
                System.out.println("Sorry, you're too young. Try again at 19");
            }
        }
        else{
            System.out.println("Sorry, you do not meet the criteria. Try a Sorority instead");
        }





    }
}
