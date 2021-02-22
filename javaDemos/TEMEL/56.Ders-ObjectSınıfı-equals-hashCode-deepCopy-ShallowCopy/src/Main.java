public class Main
{
    static class insan
    {
        int boy;
    }

    static class ogrenci extends insan implements Cloneable
    {
        Object kopyala() throws CloneNotSupportedException
        {
            return this.clone();
        }

        ogrenci kopyala2()
        {
            ogrenci temp = new ogrenci();
            temp.boy = this.boy;
            return temp;
        }

        boolean equals(ogrenci rhs)
        {
            return this.boy== rhs.boy;
        }

        public String toString() //metni ekrana yazdırır
        {
            return "bu objenin boyu " + this.boy;
        }
    }

    // NOT ==> "==" ifadesi nesnelerin adresine, "equals()" ise nesnelerin içeriğine bakar

    public static void main(String[] args) throws CloneNotSupportedException
    {
        insan ali = new insan();
        insan ahmet = ali; //shallow copy => sığ kopyalama
        ali.boy = 180;
        System.out.println(ahmet.boy);

        if (ali==ahmet)
            System.out.println("eşitler");
        if(ali.equals(ahmet)) //equals => Eşitleme işleme yapar. Eğer ki eşitse true dönderir
            System.out.println("eşitler2");


        ogrenci ayse = new ogrenci();
        ayse.boy = 160;
        ogrenci fatma = (ogrenci) ayse.kopyala(); //deep copy => derin kopyalama
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        fatma.boy = 190;
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        ayse.boy=190;

        if (ayse==fatma)
            System.out.println("eşitler3");
        if (ayse.equals(fatma))
            System.out.println("eşitler4");

        System.out.println(ayse);
        System.out.println(ayse.hashCode()); //objelerin birbiri ile karşılaştırıması

    }
}
