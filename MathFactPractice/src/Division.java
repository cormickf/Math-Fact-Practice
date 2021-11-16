import java.util.Random;
import java.util.Scanner;

class Division {

    public void division(){
        Random number = new Random();
        int wrong = 0;

        for (int i = 0; i < 15; i++) {
            int numberOne = number.nextInt(100);
            int numberTwo = number.nextInt(20);

            int correct = (numberOne / numberTwo);

            Scanner q = new Scanner(System.in);
            System.out.println(numberOne + " divided " + numberTwo);
            int awnser = q.nextInt();

            if (awnser == correct) {
                System.out.println("Correct!");

            } else {
                System.out.println("Incorrect!");
                wrong++;

            }}
        System.out.println("You got " + wrong + " questions incorrect!");





    }}
  
  
    
  