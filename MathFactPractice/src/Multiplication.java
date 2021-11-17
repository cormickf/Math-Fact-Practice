import java.util.Scanner;
import java.util.Random;

class Multiplication {

    public void multiplication(int questions){
        Random number = new Random();
        int wrong = 0;

        for (int i = 0; i < questions; i++) {
            int numberOne = number.nextInt(12);
            int numberTwo = number.nextInt(12);

            int correct = (numberOne * numberTwo);

            Scanner q = new Scanner(System.in);
            System.out.println(numberOne + " * " + numberTwo);
            int answer = q.nextInt();

            if (answer == correct) {
                System.out.println("Correct!");

            } else {
                System.out.println("Incorrect!");
                System.out.println("The correct answer is " + answer);
                wrong++;

            }}
        System.out.println("You got " + wrong + " questions incorrect!");





    }

}
