public class Main {

    public static void main(String[] args)
    {
        int toplam = topla(1,2,3,4,5,6);
        System.out.println(toplam);
    }

    public static int topla(int... sayilar) //...  bu 3 nokta variable argu
    {
        int toplam = 0;

        for(int sayi:sayilar)
            toplam += sayi;

        return toplam;
    }
}
