import java.util.Random;
import java.util.Scanner;

class Division {

    public void division(int questions){
        Random number = new Random();
        int wrong = 0;

        for (int i = 0; i < questions; i++) {
            int numberOne = number.nextInt(100);
            int numberTwo = number.nextInt(20) + 1;

            double correct = (numberOne / numberTwo);

            Scanner q = new Scanner(System.in);
            System.out.println(numberOne + " divided " + numberTwo);
            double answer = q.nextDouble();

            if (answer == correct) {
                System.out.println("Correct!");

            } else {
                System.out.println("Incorrect!");
                System.out.println("The correct answer is " + answer);
                wrong++;

            }}
        double percent = (wrong * 100) / questions;
        System.out.println("You got " + wrong + " incorrect" + "\n" + " You got a %" + percent + " On this lesson!");





    }}
  
  
    
  