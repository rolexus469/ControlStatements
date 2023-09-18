import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {

        System.out.println("Hello, and welcome to the Learning Star platform! \n");


        int learningPackage;
        int courseLoad;
        int total;
        int totalCourseLoad;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please select a learning package");
        learningPackage=keyboard.nextInt();

        System.out.println("Please enter your course load per month");
        totalCourseLoad = keyboard.nextInt();
        
        switch (learningPackage){
            case 1:
                courseLoad = 2;
                total = 10;
                if (totalCourseLoad > 2) {
                    total += (totalCourseLoad-courseLoad) * 6;
                }
                System.out.println("You've chosen Learning Package 1 and your total is $" +total + " per month");
                break;
            case 2:
                courseLoad = 4;
                total = 12;
                if(totalCourseLoad > 4){
                    total += (totalCourseLoad-courseLoad) *4;
                }
                System.out.println("You've chosen Learning Package 2 and your total is $" +total + " per month");
                break;
            case 3:
                courseLoad = 6;
                total = 15;
                if(totalCourseLoad > 6){
                    total += (totalCourseLoad-courseLoad) *3;
                }
                System.out.println("You've chosen Learning Package 3 and your total is $" +total + " per month");
            default:
                System.out.println("You've entered an invalid number");

        }

    }//end main
}
