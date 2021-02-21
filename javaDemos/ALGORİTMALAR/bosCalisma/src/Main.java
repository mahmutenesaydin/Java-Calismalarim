import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        int c = 0;

        do
        {
            c = a + b;

            System.out.println(c + " - ");
            a = b;
            b = c;
        }
        while (c<100);
    }
}
