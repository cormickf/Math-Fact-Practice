import java.util.Scanner;

class Main {


    public static void main(String[] args) {

        Scanner q1 = new Scanner(System.in);
        System.out.println("What would you like to learn? \n addition, multiplcation, subtraction or division?");
        String mathFactChoice = q1.nextLine();

        if (mathFactChoice.equals("addition")) {
            Addition add = new Addition();

            add.Addition();



        } else if (mathFactChoice.equals("subtraction")) {
            Subtraction sub = new Subtraction();
            sub.subtraction();

        } else if (mathFactChoice.equals("multiplaction")) {

            Multiplaction mult = new Multiplaction();
            mult.multiplaction();


        }else if (mathFactChoice.equals("division")) {

            Division div = new Division();
            div.division();

        }






    }
}

