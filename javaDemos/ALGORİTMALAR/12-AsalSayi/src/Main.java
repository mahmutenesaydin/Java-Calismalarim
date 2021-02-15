public class Main
{
    //0 ile 1000 arasındaki Asal sayıları bulan programı yazınız?
    public static void main(String[] args)
    {
        int bolen = 0;
        int i, j;

        for (i=3;i<1000;i++)
        {
            for(j=2;i<j;j++)
            {
                if(i%j==0)
                {
                    bolen++;
                }
            }
            if(bolen==0)
            {
                System.out.println(i);
            }
            bolen=0;
        }
    }
}
