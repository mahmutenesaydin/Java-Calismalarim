public class Main {

    public static void main(String[] args)
    {

        Product producta = new Product(1,"Tel","samsung",2);


       /* Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);*/

        ProductManager productManager = new ProductManager();
        productManager.Add(producta);
       // productManager.Add(producta);
        System.out.println(producta.getName());

        System.out.println(producta.getProductCode());
    }
}
