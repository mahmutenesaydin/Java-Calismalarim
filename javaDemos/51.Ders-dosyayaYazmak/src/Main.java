import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        writeFile();
    }

    public static void writeFile()
    {
        try
        {
            BufferedWriter writer = new BufferedWriter
                    (new FileWriter("C:\\javaDemos\\51.Ders-dosyayaYazmak\\file\\students.txt",true));
                                        //sonunda true yazmazsak sıfırlar ve öyle yazar. yani içindekiler gider. true
            writer.newLine();//bir satır boşluk bırak
            writer.write("Ahmet");
            System.out.println("Dosya Yazıldı");
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}