import java.util.Scanner;

public class Main
{
    //1- Kullanıcıdan ismini alarak "Merhaba isim" yazan programı yazınız?
    public static void main(String[] args)
    {
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.print("İsim giriniz: " );
        name = scanner.nextLine();
        System.out.println("Merhaba: " + name);
    }
}
