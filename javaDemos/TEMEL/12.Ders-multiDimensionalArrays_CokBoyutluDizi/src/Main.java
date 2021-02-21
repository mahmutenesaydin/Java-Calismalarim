public class Main {

    public static void main(String[] args)
    {
        String[][] cities = new String[3][3];

        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Kocaeli";
        cities[1][0] = "Sivas";
        cities[1][1] = "Kayseri";
        cities[1][2] = "Yozgat";
        cities[2][0] = "Trabzon";
        cities[2][1] = "Ordu";
        cities[2][2] = "Giresun";

        for(int i = 0; i<=2; i++)
        {
            System.out.println("-----------");
            for(int j = 0; j<=2; j++)
                System.out.println(cities[i][j]);
        }
    }
}
