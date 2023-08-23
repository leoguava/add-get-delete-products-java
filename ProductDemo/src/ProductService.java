import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<Product> products = new ArrayList<>();
    public void addProduct(String name, String color, String type, double price){
        products.add(new Product(name,color,type,price));
    }
    public List<Product> getAllProduct(){
        return products;
    }

     void applyDiscount(String name, Double disc){
        for(Product p:products){if(p.name.equalsIgnoreCase(name)){
            disc.toString().replace(".",",");
            p.price = p.price * (1-disc);
        }}
    }
   public Product getProduct(String name){
       for(Product p: products) {
           if(p.name.equalsIgnoreCase(name) || p.type.equalsIgnoreCase(name) || p.color.equalsIgnoreCase(name) ){
               System
                       .out
                       .println("The product you are looking for is : "+
                               p.name+", the color avaiable is "+
                               p.color+"and it costs $"+p.price);
           }
       }

            return null;}


}
