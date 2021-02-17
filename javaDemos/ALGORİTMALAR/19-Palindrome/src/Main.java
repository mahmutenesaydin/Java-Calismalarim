public class Main
{
//Tersten yazıldığında da aynı değeri olan sayılara Palindrom sayılar denir. Örnek olarak
// "1991" veya "34543" sayıları tersten yazılsa bile aynı değerde olurlar.
// 1000 - 100000 sayıları arasındaki palindromları bulan programı yazınız?
    public static void main(String[] args)
    {
        int i, j;
        String ters,duz;

        for (i=1000; i<10000; i++)
        {
            duz = Integer.toString(i);
            ters="";
            for (j = duz.length()-1; j >= 0; j--)
            {
                ters += duz.charAt(j);
            }
            if(duz.equals(ters))  //equals: 2 tane string'i karşılaştırır. doğruysa true dönderir
                System.out.print(i+ " - " );
        }

    }
}
