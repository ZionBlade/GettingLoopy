public class Main {
    public static void main(String[] args)
    {

        String s = "*";
        // task 1
        for(int x=0; x<= 30 ; x++)
        {
            System.out.println(x);
        }

        for(int l=0; l < 3; l++)
            System.out.println();








        //task 5

        for (int y=1; y <= 5; y++) //row
        {
            for (int x = 1 ; x <= y ; x++) //column
            {
                System.out.print(s);
            }
            System.out.println();
        }

        for(int l=0; l < 3; l++)
            System.out.println();

        //task 6
        for (int y=1; y <= 5; y++) //row
        {
            for (int x = 5 ; x >= y ; x--) //column
            {
                System.out.print(s);
            }
            System.out.println();
        }

        for(int l=0; l < 3; l++)
            System.out.println();

        // task 7
        for (int y=1; y <= 5; y++) //row
        {
            for (int x = 1 ; x <= 5 ; x++) //column
            {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}