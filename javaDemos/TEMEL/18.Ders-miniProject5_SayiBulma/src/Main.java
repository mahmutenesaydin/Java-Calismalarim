public class Main {

    public static void main(String[] args)
    {
        int[] sayilar = new int[]{1,3,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar)
        {
            if(sayi == aranacak)
            {
                varMi = true;
                break;
            }
        }

        if (varMi)
            System.out.println("Var");
        else
            System.out.println("Yok");
    }
}