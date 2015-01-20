
public class  TestBook {
	   public static void main(String[] args) {
		  Author a1 = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
	      System.out.println(a1.toString());   // explicit call Author
	      Book b1 = new Book("Java for dummy", a1, 19.95, 1000);
	      System.out.println(b1.toString());   // explicit call Book
	      
	      //Printing the name of the author from a Book instance
	      System.out.println(b1.getAuthor().getName());
	      
	      //new methods in the Book class to return the name, email and gender of the author of the book
	      System.out.println(b1.getAuthorName());
	      System.out.println(b1.getAuthorEmail());
	      System.out.println(b1.getAuthorGender());
	      }
	   
}