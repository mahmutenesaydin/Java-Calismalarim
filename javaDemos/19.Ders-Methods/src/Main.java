public class Main {

    public static void main(String[] args)
    {
        sayiBulmaca();
    }

    public static void sayiBulmaca()
    {
        int[] sayilar = new int[]{1, 3, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi = false;

        for(int sayi : sayilar) {
            if (sayi == aranacak)
            {
                varMi = true;
                break;
            }
        }

        String mesaj = "";
        if (varMi) {
            mesaj = "var" + aranacak;
            mesajVer(mesaj);
        } else {
            mesajVer("Yok" + aranacak);
        }
    }

    public  static  void mesajVer(String mesaj)
    {
        System.out.println(mesaj);
    }
}
