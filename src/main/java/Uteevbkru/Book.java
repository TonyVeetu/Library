package Uteevbkru;

public class Book extends Paper{
	private String nameBook;

	public Book(String nameBooks ,String aut, int ageRect, int y, int m, int d ){
		super(aut, ageRect, y, m, d);
		this.nameBook = nameBooks;
	}
	
	public String getName(){
		return nameBook;
	}
	
	public String getDescription(){
		return "Book: " + nameBook + ", " + super.getAuthor() 
		+ " ageRect: " + super.getAgeOver() + ", ID = " + super.getId();
	}
	
}
