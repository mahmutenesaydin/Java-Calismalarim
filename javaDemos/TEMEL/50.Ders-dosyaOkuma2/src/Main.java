import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        readFile();
    }

    public static void readFile()
    {
        File file = new File("C:\\javaDemos\\50.Ders-dosyaOkuma2\\file\\students.txt");
        try
        {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
