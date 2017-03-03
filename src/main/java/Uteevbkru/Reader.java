package Uteevbkru;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public abstract class Reader {
	private String name;
	private String surname;
	private Date birthday;
	private Integer age;
	private ArrayList<Paper> paperInUse;
	private GregorianCalendar calendar;	
	
	static final int MAXPAPER = 3;
	private int finishedPaper = 0;
	
	public Reader(String n, String s, int a, int y, int m, int d){
		name = n; surname = s;
		calendar = new GregorianCalendar(y, m-1, d);//январь ноль
		birthday = calendar.getTime();
		age = a;
		paperInUse = new ArrayList<Paper>();
	}
	
	public String getName(){
		return name;
	}
	public String getSurname(){
		return surname;
	}
	public Date getBerthday(){
		return birthday;
	}
	public void addPaper(Paper p){
		if(paperInUse.size() < Reader.MAXPAPER ){
			if(age >= p.getAgeOver()){
				paperInUse.add(p);
				addFinishedPaper();//TODO use removePaper // либо корешок!!
			}
			else{
				System.out.println("Reject:Reader is not big enought!");
			}
		}
		else{
			System.out.println("Func.<addPaper> to many books. " + p.getDescription());
		}
	}
	public void addFinishedPaper(){
		finishedPaper++;
	}
	public int getFinishedPaper(){
		return finishedPaper;
	}
	public String returnPaperInUse(int i){
		if(paperInUse.size() > i && paperInUse.get(i) != null){//TODO understand this!!!
			//System.out.print("a");
			return paperInUse.get(i).getDescription();
		}
		else{
			//System.out.print("b");
			return "Zero";
		}
	}
	public int randomId(){
		Random gen = new Random();
		return gen.nextInt(10); 
	}
	public String getAge(){
		return age.toString();
	}
	
	@Override
	public String toString(){
		return getName() + " " + getSurname() + ", age "  +  getAge() + ".";
	}
	
	abstract String getDesc();
	abstract String getDescUsePaper();
}
