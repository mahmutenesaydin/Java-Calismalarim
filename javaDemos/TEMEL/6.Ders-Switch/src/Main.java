public class Main {

    public static void main(String[] args)
    {
        char grade = 'A';

        switch (grade)
        {
            case 'A':
                System.out.println("Harika not, geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("Tamam geçtin");
                break;
            case'F':
                System.out.println("HHOOPPP Hemşerim nereye, kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}
