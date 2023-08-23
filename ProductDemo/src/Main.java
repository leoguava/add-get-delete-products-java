import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        ProductService service = new ProductService();
        service.addProduct("BlackBerry","White","Cellphone",2600);
        service.addProduct("Xiaomi","White","Cellphone",2400);
        service.addProduct("Razer","Black","Mouse",4000);
        service.addProduct("Iphone","White","Cellphone",2300);
        service.addProduct("Razer","Black","Headset",3700);
        service.addProduct("Logitech","Blue","Cellphone",4000);
        service.addProduct("Samsung","White","Cellphone",1200);
        service.addProduct("Motorola","Red","Cellphone",2560);
        service.addProduct("Lenovo","White","Notebook",7040);
        service.addProduct("Acer","Red","Notebook",6000);

        System.out.print("Search for the name of the product: ");
        String name = entry.nextLine();

        System.out.print("Now type the discount: ");
        double disc = Double.parseDouble(entry.next().replace(",","."));
        service.applyDiscount(name,disc);
        service.getProduct(name);









    }

}