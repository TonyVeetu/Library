package Uteevbkru;

import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Date;

abstract class Paper {
	private String author;	
	private Integer idNumber;
	private Integer ageOver;
	private Date dateIssue;
//	private ArrayList<String> users;// Аналог вкладки в книгу! //TODO корешок книги с временем
	
	private static int ID = 0; // Переменная хранит текущее количество обьектов!
	private int countOfReader = 0;
		
	public Paper(String aut, int ageR, int y, int m, int d){
		author = aut; ageOver = ageR; 
		setId();
		GregorianCalendar calendar = new GregorianCalendar(y, m-1, d);//январь ноль
		dateIssue = calendar.getTime();
//		users = new ArrayList<String>();		
	}

//***************//TODO use корешок!!!!****************
//Но тут нужно понимать, что быстрее  сделать! Посмотреть все корешки или иметь параметр!
// НО нужно ИЗБЕГАТЬ повторения данных!!!!
	public void incCountOfReader(){
		countOfReader++;
	}								
	public int getCountOfReader(){
		return countOfReader;
	}
//--------------------------------------	
	private void setId(){
		idNumber = ID;
		ID++;
	}
	public String getAuthor( ){
		return author;
	}
	public Integer getId( ){
		return idNumber;
	}
	public Integer getAgeOver(){
		return ageOver;
	}
//	public void setUser(String user){
//		users.add(user);
//	}
	public Date getDateIssue(){
		return dateIssue;
	}
	@Override
	public String toString(){
		return "Author:" + getAuthor() + ", Id: " + getId().toString() + ", agerectrict: "  +  getAgeOver().toString() + ".";
	}
	
	public abstract String getDescription();
	
	public class Users{
		private ArrayList <Reader> userList;
		private ArrayList <Date> timeUsing;
		
		public Users(){
			userList = new ArrayList<Reader>();
			timeUsing = new ArrayList<Date>();
		}
		
		public void whoUse(){
			
		}
 	}
}
