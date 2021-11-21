import java.util.Scanner;
import java.util.Random;
class Subtraction {


    public void subtraction(int questions){
        Random number = new Random();
        int wrong = 0;
        for (int i = 0; i < questions; i++) {
            int numberOne = number.nextInt(100);
            int numberTwo = number.nextInt(50);

            double correct = (numberOne - numberTwo);


            Scanner q2 = new Scanner(System.in);
            System.out.println(numberOne + " - " + numberTwo);
            double answer = q2.nextInt();


            if (answer == correct) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
                System.out.println("The correct answer is " + answer);
                wrong++;
            }
        }
        double percent = (wrong * 100) / questions;
        System.out.println("You got " + wrong + " incorrect" + "\n" + " You got a %" + percent + " On this lesson!");

    }




}
