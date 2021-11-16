import java.util.Scanner;
import java.util.Random;

class Multiplaction {

    public void multiplaction(){
        Random number = new Random();
        int wrong = 0;

        for (int i = 0; i < 15; i++) {
            int numberOne = number.nextInt(12);
            int numberTwo = number.nextInt(12);

            int correct = (numberOne * numberTwo);

            Scanner q = new Scanner(System.in);
            System.out.println(numberOne + " * " + numberTwo);
            int awnser = q.nextInt();

            if (awnser == correct) {
                System.out.println("Correct!");

            } else {
                System.out.println("Incorrect!");
                wrong++;

            }}
        System.out.println("You got " + wrong + " questions incorrect!");





    }

}
