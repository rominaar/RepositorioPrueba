

public class Book {
	private String name;
	private Author [] author;
	private double price;
	private int qtyInStock;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	
	//public Author getAuthor() {	return author;}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	//1st constructor
		public Book (String name, Author author, double price) {
			this.name = name;
			this.author[] = author;
			this.price = price;
		}
		
	//2nd constructor
		public Book (String name, Author author, double price, int qtyInStock) {
			this.name = name;
			this.author  = author;
			this.price = price;
			this.qtyInStock = qtyInStock;
		}
		
	//public String toString() 
		public String toString() {
			   return name + " by " + author;
		}
		
		//new methods in the Book class to return the name, email and gender of the author of the book
	    public String getAuthorName() { return author.getName(); }    
	    
	    public String getAuthorEmail() { return author.getEmail(); }
	    
	    public char getAuthorGender() { return author.getGender(); }
	


}
