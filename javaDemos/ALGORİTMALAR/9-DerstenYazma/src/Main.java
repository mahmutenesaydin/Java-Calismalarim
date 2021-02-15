import java.util.Scanner;

public class Main
{
    //Kullanıcıdan ismini alıp ekrana tersten yazan programı yazınız?
    public static void main(String[] args)
    {
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.print("İsim giriniz: ");
        name = scanner.nextLine();

        int i;

        for(i=name.length()-1; i>=0; i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}
