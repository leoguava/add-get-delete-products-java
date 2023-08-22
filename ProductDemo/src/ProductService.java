import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<Product> products = new ArrayList<>();
    public void addProduct(Product p){
        products.add(p);
    }
    public List<Product> getAllProduct(){
        return products;
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
