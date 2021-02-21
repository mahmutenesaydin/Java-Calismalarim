import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {

        ArrayList object = new ArrayList();

        object.add(1); //object'e yeni bir eleman eklemek için add kullanılır
        object.add(8);
        object.add("Sivas");
        System.out.println(object.size()); //object'de kaç eleman olduğunu gösterir

        object.set(0,9); //set ise değiştirir. yani 0.index 1 yerine 9 olur
        System.out.println(object.get(0)); //get ise getir yani 0. indexi getir

        object.remove(2); //2.indexi yani sivas'ı silecek
        object.clear(); //bütün indexleri silecek


        for(Object i:object)
        {
            System.out.println(i);
        }
    }
}
