import com.sun.jdi.ClassNotLoadedException;

import java.io.*;

public class Main
{

    //Serileştirme: Bir nesneyi bir yerden başka bir yere taşımak ve nesneyi depolayıp istenildiği zaman elde etmek için kullanılır

    public static void main(String[] args)
    {
        User user = new User();
        user.setName("Mahmut Enes");
        user.setSurname("Aydın");

        //dosya yazdırma
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        //dosya okuma
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try
        {
            //DOSYA YAZDIRMA
            fileOutputStream = new FileOutputStream("C:\\javaDemos\\TEMEL\\59.Ders-Serilestirme-Serializable\\deneme.ser");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);
            System.out.println("Nesne yazdırma başarılı");
            objectOutputStream.close();

            //DOSYA OKUMA
            fileInputStream = new FileInputStream("C:\\javaDemos\\TEMEL\\59.Ders-Serilestirme-Serializable\\deneme.ser");
            objectInputStream = new ObjectInputStream(fileInputStream);
            User user2 =(User)objectInputStream.readObject();
            System.out.println(user2    );
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
