package Uteevbkru;

public class LibraryTest {

	final static int MAXPAPER = 10;
	static final int MAXREADER = 2;
	
	public static void main(String[] args) {
		System.out.print("Hello, Toshka!");
		System.out.println("Ну что, давай запили МЕГА крутую библеотеку!!!!");

		Library lib = new Library();
		
		Paper[] doc = new Paper[LibraryTest.MAXPAPER];
		
		//lib.readFile("src//main//java//Uteevbkru//ListOfPaper.txt", doc);
				
//		Paper[] doc = new Paper[LibraryTest.MAXPAPER];//What is happen there?????  
//		doc[0] = new Book("<Rule of>", "Hor", 17, 2001, 2, 21);
//		doc[1] = new Book("<Rule of l>", "Hori", 18, 2002, 3, 22);
//		doc[2] = new Book("<Rule of li>", "Horis", 19, 2003, 4, 23);
//		doc[3] = new Book("<Rule of lif>", "Horisa", 20, 2004, 7, 24);
//		doc[4] = new Book("<Rule of life>", "Horisan", 21, 2005, 6, 25);
//		doc[5] = new Newspaper("G", 7, 2012, 15, 12, "<RedSunS>" ); 
//		doc[6] = new Newspaper("Go", 8, 2013, 15, 12, "<RedSunSh>" ); 
//		doc[7] = new Newspaper("Got", 9, 2014, 15, 12, "<RedSunShi>" ); 
//		doc[8] = new Newspaper("Gott", 10, 2015, 15, 12, "<RedSunShin>" ); 
//		doc[9] = new Newspaper("Gotta", 11, 2016, 15, 12, "<RedSunShine>" ); 
//		
//		Reader[] read = new Reader[LibraryTest.MAXREADER];
//		read[0] = new Student("Ivan", "Foran", 23, 1993, 2, 23, "MGU");
//		read[1] = new Student("Sergey", "Koshkov", 10, 1998, 3, 2, "MADI");
//		
//		Library lib = new Library();
//		for(Paper d : doc){
//			lib.addPaper(d);
//		}
//		for(Reader r : read){
//			lib.addReader(r);
//		}
//		
//		final int FIR = 0; 
//		for(int i = 0; i < Reader.MAXPAPER; i++){
//			int id = read[FIR].randomId();
//			lib.takePaper(read[FIR], id);
//		}
//		System.out.println(lib.getDescriptionReader(FIR));
//		final int SEC = 1;
//		for(int i = 0; i < Reader.MAXPAPER; i++){
//			int id = read[SEC].randomId();
//			lib.takePaper(read[SEC], id);
//		}
//		System.out.println(lib.getDescriptionReader(SEC));
//		
//		System.out.println(lib.theBestReader().toString());
		
//		System.out.println(read[0]);
//		System.out.println(doc[0]);
//		System.out.println(doc[9]);		
//		for(int i = 0; i < doc.length; i++ ){
//			System.out.println(lib.getDescriptionPaper(i));
//		}
	}

}
