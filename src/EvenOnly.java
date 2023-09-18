public class EvenOnly {
    public static void main(String[] args) {
        int counter = 0;

        while(counter < 10){

            if(counter % 2 == 1){
                counter++;
                continue;
            }
            System.out.println(counter + "\t");

            counter++;
//

            //SIMPLER VERSION
//            if(counter % 2 == 0) {
//                System.out.println(counter + "\t");
//            }
//            counter++;
        }
    }
}
