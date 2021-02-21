import java.io.File;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        getFileInfo();
    }

    public static void createNewFile()
    {
        File file = new File("C:\\javaDemos\\49.Ders-dosyaYoluOkuma\\file\\students.txt");

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

    public static void getFileInfo()
    {
        File file = new File("C:\\javaDemos\\48.Ders-workingWithFiles_Dosyalar\\file\\students.txt");

        if(file.exists())
        {
            System.out.println("Dosya adı: " + file.getName());
            System.out.println("Dosya yolu: " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi?: " + file.canWrite());
            System.out.println("Dosya okunabilir mi?: " + file.canRead());
            System.out.println("Dosya boyutu (byte): " + file.length());
        }
    }
}
