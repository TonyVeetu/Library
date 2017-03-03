package Uteevbkru;

public class Student extends Reader {
	private String University;
	
	public Student(String n, String s, int a, int y, int m, int d, String Univer){
		super(n, s, a, y, m, d);
		University = Univer;
	}
	public String getUniver(){
		return University;
	}
	
//____________!!!!!!!!!!!__________	
	public String getDescUsePaper(){		
		return "(1)" + super.returnPaperInUse(0) + ";" +
			"  (2)" + super.returnPaperInUse(1) + ";"+
		    " (3)" + super.returnPaperInUse(2) + ";";
	}
//*********************************
	public String getDesc(){
		return super.getName() + " " + super.getSurname() + " " + University;
	}

	public void addFinishedPaper(){
		super.addFinishedPaper();
	}
	public int getFinishedPaper(){
		return super.getFinishedPaper();
	}
}