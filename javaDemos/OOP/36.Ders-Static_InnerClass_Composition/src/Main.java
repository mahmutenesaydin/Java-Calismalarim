public class Main {

    public static void main(String[] args)
    {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name="Tel";
        product.price=2;

        productManager.add(product);


    }
}
