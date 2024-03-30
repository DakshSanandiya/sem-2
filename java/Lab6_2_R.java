import java.util.*;
class Book {
    private String authorName;
    private String title;

    public Book(String authorName, String title) {
        this.authorName = authorName;
        this.title = title;
    }

    public void display() {
        System.out.println("Author: " + authorName);
        System.out.println("Title: " + title);
    }
}

 class BookPublication extends Book {
    
    public BookPublication(String authorName, String title) {
        super(authorName, title);
    }

  
    public void display() {
        System.out.println("Book Publication");
        super.display();
    }
}

class PaperPublication extends Book {

    public PaperPublication(String authorName, String title) {
        super(authorName, title);
    }

    
     public void display() {
         System.out.println("Paper Publication");
         super.display();
     }
}

public class Lab6_2_R {

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter book authorName:");
        String an = sc.next();

        System.out.println("Enter book title:");
        String bt = sc.next();
        
        System.out.println("Enter paper authorName:");
        String pan = sc.next();
        
        System.out.println("Enter paper title:");
        String pt = sc.next();

        Book book1 = new BookPublication(an,bt);
        System.out.println("");
        book1.display();

        System.out.println("");

        Book book2 = new PaperPublication(pan,pt);
        System.out.println("");
        book2.display();
   }
}
