class BookLibrary{
    private String title;
    private String author;
    private int price;

    public BookLibrary(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price  = price ;
    }

    public void discountPrice(int amount) {
        price = price-(price*amount/100);
    }
    void showDetails (){
            System.out.println("title : "+title);
            System.out.println("author : "+author);
            System.out.println("price : "+price);
    }
}

public class BookLibraryMain {
   public static void main(String[] args) {
    BookLibrary bl = new BookLibrary("Himu and rupa","humayn ahmed", 1000);
    bl.discountPrice(10);
    bl.showDetails();

    BookLibrary b2 = new BookLibrary("Himu and rupa","humayn ahmed", 1000);
    b2.showDetails();
    
   }
}

/*Book Library
A Book class with title, author, price.
Display discounted price.
*/
