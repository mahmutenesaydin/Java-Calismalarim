import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("kod.txt");
        if (!file.exists())
            file.createNewFile();

        String value = "MAHMUT ENES AYDIN";

        FileWriter fileWriter = new FileWriter(file,false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); //dosya işlemlerimizi hızlandırır
        bufferedWriter.write(value);
        bufferedWriter.write("\nSİVASLI");
        bufferedWriter.close();

        FileReader fileReader = new FileReader(file);
        String line;

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((line = bufferedReader.readLine()) != null) //dosya okuma boş geldiyse okuyacak değer kalmadığından while biter
        {
            System.out.println(line);
        }
        bufferedReader.close();

    }
}
