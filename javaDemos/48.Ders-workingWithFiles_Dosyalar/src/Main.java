import java.io.File;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\javaDemos\\48.Ders-workingWithFiles_Dosyalar\\file\\students.txt");

        try
        {
            if(file.createNewFile())
                System.out.println("Dosya oluşturuldu");
            else
                System.out.println("Dosya zaten mevcut");
        }
        catch (IOException ioex)
        {
            ioex.printStackTrace();
        }
    }
}
