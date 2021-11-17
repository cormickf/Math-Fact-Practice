import java.util.Scanner;

class Main {


    public static void main(String[] args) {

        Scanner q1 = new Scanner(System.in);
        System.out.println("What would you like to learn? \n addition, Multiplication, subtraction or division?");
        String mathFactChoice = q1.nextLine();

        Scanner q2 = new Scanner(System.in);
        System.out.println("Please enter how many " + mathFactChoice + " questions you want to do!");
        int questions = q2.nextInt();

        if (mathFactChoice.equals("addition")) {
            Addition add = new Addition();

            add.Addition(questions);



        } else if (mathFactChoice.equals("subtraction")) {
            Subtraction sub = new Subtraction();
            sub.subtraction(questions);

        } else if (mathFactChoice.equals("multiplication")) {

            Multiplication mult = new Multiplication();
            mult.multiplication(questions);


        }else if (mathFactChoice.equals("division")) {

            Division div = new Division();
            div.division(questions);

        }






    }
}

