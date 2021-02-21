import java.util.Locale;
import java.util.Optional;

public class Main {

    public static void main(String[] args)
    {
        String mesaj = "Mahmut Enes Aydın";

        System.out.println(mesaj);
        System.out.println("Eleman Sayısı: " + mesaj.length());
        System.out.println("5.eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Adamdır"));
        System.out.println(mesaj.startsWith("m"));
        System.out.println(mesaj.endsWith("n"));
        char[]karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('u'));
        System.out.println(mesaj.lastIndexOf("dı"));


        System.out.println("------------14.Ders-------------");


        String yeniMesaj = mesaj.replace(' ','-'); //kelime arası boşluk
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5)); //kelimeleri ayırma

        for(String kelime : mesaj.split(" ") )
            System.out.println(kelime);

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());  //başındaki ve sonundaki boşlukları kaldırır



    }
}
