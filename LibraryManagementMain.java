import java.util.ArrayList;

class LibraryManagement{

    ArrayList<String> bookName = new ArrayList<>();
    public void addBook(String book){
        bookName.add(book); 
    }
    public void issueBook(String book) {
        if(bookName.contains(book)){
            System.out.println("book issued successfully");
            bookName.remove(book);
        } else {
            System.out.println("Book not available");
        }
        
    }

    public void returnBook(String book) {
        bookName.add(book);
    }

    public void chkAvaility(String book){
        if(bookName.contains(book)) {
            System.out.println(book+" book is availabel");
        } else{
            System.out.println(book+" this book is not availavle");
        }
    }
}

public class LibraryManagementMain {
    public static void main(String[] args) {
        LibraryManagement lm = new LibraryManagement();
        lm.addBook("joljosna");
        lm.addBook("rupa");
        lm.addBook("padda nodir majhi");

        System.out.println("Chk avaibility at beginnig");
        lm.chkAvaility("rupa");
        lm.issueBook("rupa");
        System.out.println("Chk after issue book ");
        lm.chkAvaility("rupa");
        lm.returnBook("rupa");
        System.out.println("Chk after before");
        lm.chkAvaility("rupa");
    }
}
