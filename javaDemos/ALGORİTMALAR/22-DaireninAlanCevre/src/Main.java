import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int r;
        double alan, hacim, pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Daire yarıçapı: " );
        r = scanner.nextInt();

        alan = 2 * pi * r;
        hacim = pi * (r*r);

        System.out.println("Daire alanı: " + alan);
        System.out.println("Darie hacmi: " + hacim);
    }
}
