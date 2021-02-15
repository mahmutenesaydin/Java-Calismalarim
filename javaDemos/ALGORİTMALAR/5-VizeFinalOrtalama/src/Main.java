import java.util.Scanner;

public class Main
{
    //5- Vize notunun %40'ını, Final notunun %60'ını alarak ortalama notu hesaplayan,
    // ortalama 50 den büyükse "Geçti", küçükse "Kaldı" yazan programı yazınız?

    public static void main(String[] args)
    {
        int vize, fınal, toplam;
        float avg;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize: ");
        vize = scanner.nextInt();

        System.out.print("Final: ");
        fınal = scanner.nextInt();

        //avg = (vize*40/100) + (fınal*60/100);
        avg = (float) (vize * 0.4 + fınal * 0.6);

        System.out.println("Ortalama: " + avg );

        if (avg >= 50)
            System.out.println("Geçti");
        else
            System.out.println("Kaldı");
    }
}
