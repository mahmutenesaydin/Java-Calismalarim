import java.util.Scanner;

public class Main {
    //Kullanıcıdan alınan bir cümlede kaç adet kelime olduğunu ve kaç adet harf olduğunu bulan programı yazınız?
    public static void main(String[] args) {
        String kelime;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cümle giriniz: ");
        kelime = scanner.nextLine();

        System.out.println("Kelime Sayisi: " + kelime.length());

        int sayac = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == ' ')
                sayac++;
        }
        System.out.println(sayac + 1);
    }
}