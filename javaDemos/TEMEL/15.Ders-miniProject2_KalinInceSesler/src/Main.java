import javax.security.auth.kerberos.KerberosCredMessage;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)
    {
        char harf = 'A';

        switch (harf)
        {
            case 'A':
            case 'I':
                System.out.println("Kalın");
                break;
            case'E':
            case 'İ':
                System.out.println("İnce");
                break;
            default:
                System.out.println("Bu harf geçersiz");
        }
    }
}
