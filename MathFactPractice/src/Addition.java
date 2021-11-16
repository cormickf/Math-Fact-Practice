import java.util.Random;
import java.util.Scanner;
class Addition {


    public void Addition(){
        Random number = new Random();
        int wrong = 0;


        for (int i =0; i < 25; i++) {
            int firstNumber = number.nextInt(100);
            int secondNumber = number.nextInt(100);

            int correct = (firstNumber + secondNumber);

            Scanner q = new Scanner(System.in);
            System.out.println(firstNumber + " + " + secondNumber);
            int awnser = q.nextInt();

            if (awnser == correct) {
                System.out.println("Correct!");


            } else {
                System.out.println("Incorrect!");
                wrong++;


            }

        }
        System.out.println("You got " + wrong + " incorrect!");


    }
}
