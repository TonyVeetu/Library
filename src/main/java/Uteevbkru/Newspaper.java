package Uteevbkru;

public class Newspaper extends Paper {
	
	private String publHouse;
	
	public Newspaper(String aut, int ageRect, int y, int m, int d, String publHouse ){
		super(aut, ageRect, y, m, d);
		this.publHouse = publHouse; 
	}
	
	public String  getDescription(){
		return "Newspaper " + publHouse + ", ID = " + super.getId();
	}
}