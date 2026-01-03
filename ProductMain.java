
import java.util.ArrayList;

class Product{
    private String name;
    private double price;
    private int discount;

    public Product(String name,double price,int discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public double finalPirce() {
        return price-(discount*price)/100;
    }
    public String getName(){
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    public double getPrice() {
        return price;
    }

}


public class ProductMain {
    public static void main(String[] args) {
         ArrayList<Product> products = new ArrayList<>();
         products.add(new Product("Mobile", 10000, 20));
         products.add(new Product("Tv", 20000, 10));
         products.add(new Product("Bike", 100000, 10));

         for(Product p:products) {
            System.out.println("Product name : "+p.getName());
            System.out.println("original price : "+p.getPrice());
            System.out.println("discount get : "+p.getDiscount()+" %");
            System.out.println("after discount fianl price : "+p.finalPirce());
            System.out.println("--------------------------------");
         }
    }
}
