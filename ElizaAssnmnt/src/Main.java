import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Good day. What is your problem? ");


        Scanner input = new Scanner(System.in);
        String userinput = "";


        while (!userinput.equalsIgnoreCase("Q") || !userinput.equalsIgnoreCase("i am feeling great")) {


            System.out.print("\nEnter your response here or Q to quit: ");
            userinput = input.nextLine();
            System.out.print(userinput);

            if (userinput.equalsIgnoreCase("i am feeling great") || userinput.equalsIgnoreCase("Q")) {
                System.out.println("\n>>> END");
                System.exit(0);

            }


        }
    }
}