import java.util.Scanner;
public class SumFun {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int input = 0;
        int input1;
        int base = 105;
        int sum = 0;





        
        while(input >= 0){

            System.out.println("Enter a non-negative integer");
            System.out.println("Or negative to exit");
            input = keyboard.nextInt();
            input1 = base + input;
            sum = input1 + sum;


            System.out.println(input1);
        }
        System.out.println("The sum is " + sum);

    }
}
