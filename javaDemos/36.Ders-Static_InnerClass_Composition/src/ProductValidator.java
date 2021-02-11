public class ProductValidator
{

    static {
        System.out.println("Statik Yapıcı Blok");
    }

    public ProductValidator()
    {
        System.out.println("Yapıcı Blok");
    }

    public static boolean isValid(Product product)
    {
        if(product.price > 0 && !product.name.isEmpty())
            return true;
        else
            return false;
    }

    public void bisey()
    {

    }
}
