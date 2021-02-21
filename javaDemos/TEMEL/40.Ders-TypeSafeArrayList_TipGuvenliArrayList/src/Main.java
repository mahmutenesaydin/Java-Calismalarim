import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("İstanbul");
        sehirler.add("Kocaeli");
        sehirler.add("Çanakkale");
        sehirler.add("Sivas");
        sehirler.add("Ankara");

        sehirler.remove("Kocaeli");
        Collections.sort(sehirler); //sehirleri alfabetik sıralar;

        for (String sehir:sehirler)
            System.out.println(sehir);
    }
}
