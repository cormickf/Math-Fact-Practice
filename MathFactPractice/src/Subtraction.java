import java.util.Scanner;
import java.util.Random;
class Subtraction {


    public void subtraction(){
        Random number = new Random();
        int wrong = 0;
        for (int i = 0; i < 20; i++) {
            int numberOne = number.nextInt(100);
            int numberTwo = number.nextInt(50);

            double correct = (numberOne - numberTwo);


            Scanner q2 = new Scanner(System.in);
            System.out.println(numberOne + " - " + numberTwo);
            double awnser = q2.nextInt();


            if (awnser == correct) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
                wrong++;
            }
        }
        System.out.println("You got " + wrong + " incorrect");

    }




}
