import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String userName, password;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        userName = scanner.nextLine();
        System.out.print("Şifre: ");
        password = scanner.nextLine();

        if(userName.equals("admin") && password.equals("123"))
            System.out.println("Giriş Başarılı");
        else
            System.out.println("Hatalı Giriş");
    }
}
