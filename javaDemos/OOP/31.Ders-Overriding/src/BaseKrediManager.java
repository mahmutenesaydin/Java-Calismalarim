public class BaseKrediManager
{
    public double hesapla(double tutar)
    {
        return tutar * 1.18;
    }
}


//eğer ki "final" yazarsak sabit kalır ve başka yerde ezilemez.
// public "final" double hesapla(...)....