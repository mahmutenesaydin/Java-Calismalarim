public class Main {

    public static void main(String[] args)
    {
        double myList[] = {1.2, 1.3, 2.4, 5.6, 7.6};
        double total = 0;
        double max = myList[0];

        for(double list:myList)
        {
            if(max < list)
                max = list;
            total = total + list;
            System.out.println(list);
            System.out.println(list);
        }

        System.out.println("Toplam: " + total);
        System.out.println("En büyük: " + max);
    }
}
