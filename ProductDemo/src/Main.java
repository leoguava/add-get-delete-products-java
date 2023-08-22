import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);


        ProductService service = new ProductService();
        service.addProduct(new Product("BlackBerry","White","Cellphone",2600));
        service.addProduct(new Product("Xiaomi","White","Cellphone",2400));
        service.addProduct(new Product("Razer","Black","Mouse",4000));
        service.addProduct(new Product("Iphone","White","Cellphone",2300));
        service.addProduct(new Product("Razer","Black","Headset",3700));
        service.addProduct(new Product("Logitech","Blue","Cellphone",4000));
        service.addProduct(new Product("Samsung","White","Cellphone",1200));
        service.addProduct(new Product("Motorola","Red","Cellphone",2560));
        service.addProduct(new Product("Lenovo","White","Notebook",7040));
        service.addProduct(new Product("Nitro","Red","Notebook",6000));

        System.out.println("Search for the name of the product: ");
        String name = entry.nextLine();
        service.getProduct(name);









    }

}