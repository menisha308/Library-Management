package College;
import java.util.Scanner; //import package
public class Book { //class
 // Class data members
    public int sNo;
    public String bookName;
    public String authorName;
    public int bookQty;
    
// read input from users
    Scanner input = new Scanner(System.in);
  // Method
  // To add book details
    public book()
    {
        // Display message for taking input later
        // nextInt() and nextLine() standard methods
        System.out.println("Enter Serial No of Book:");
        this.sNo = input.nextInt();
        input.nextLine();
 
        System.out.println("Enter Book Name:");
        this.bookName = input.nextLine();
 
        System.out.println("Enter Author Name:");
        this.authorName = input.nextLine();
 
        System.out.println("Enter Quantity of Books:");
        this.bookQty = input.nextInt();
        bookQtyCopy = this.bookQty;
    }
} 
