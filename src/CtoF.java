import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double celsius= 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;

        done = false;
            do {
                System.out.print("Please enter the temperature in celsius: ");
                if (in.hasNextDouble()) {
                    celsius = in.nextDouble();
                    in.nextLine();
                    System.out.println("\nYou said the temperature in celsius was: " + celsius);

                    fahrenheit = (celsius * 1.8) + 32;

                    System.out.println("The Temperature in Fahrenheit is: " + fahrenheit);

                    done = true;
                } else {
                    trash = in.nextLine();
                    System.out.println(trash + " is a Bad input, run the program again!");
                }
            }while(!done);
    }
}
