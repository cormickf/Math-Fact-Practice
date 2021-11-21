import java.util.Random;
import java.util.Scanner;
class Addition {


    public void Addition(int questions){
        Random number = new Random();
        int wrong = 0;


        for (int i =0; i < questions; i++) {
            int firstNumber = number.nextInt(100);
            int secondNumber = number.nextInt(100);

            int correct = (firstNumber + secondNumber);

            Scanner q = new Scanner(System.in);
            System.out.println(firstNumber + " + " + secondNumber);
            int answer = q.nextInt();

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
