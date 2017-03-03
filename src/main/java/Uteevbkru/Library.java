package Uteevbkru;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Library {

	private ArrayList<Paper> onShelf;
	private ArrayList<Reader> listOfR;
	
	public Library(){
		onShelf = new ArrayList<Paper>();
		listOfR = new ArrayList<Reader>(); 
		
	}
	
	public void addPaper(Paper A){
		onShelf.add(A);
	}
	public void addReader(Reader A){
		listOfR.add(A);
	}
	
	public String getDescriptionPaper(int a){
		return onShelf.get(a).getDescription();
	}
	public String getDescriptionReader(int a){
		return listOfR.get(a).getDesc() + " is reading:" + listOfR.get(a).getDescUsePaper();
	}

	public void takePaper(Reader r, int idBook){
		for(int i = 0; i < listOfR.size();/*Reader.MAXREADER;*/ i++){
			if(listOfR.get(i).equals(r)){				
				listOfR.get(i).addPaper(onShelf.get(idBook));
			}
		}		 
	}
	public ArrayList<Reader> theBestReader(){//This is person, who has read max count of books!
		/**
		 * Analyze listOFReader twice, it isn't perfect!
		 */
		int maxBooks = 0; int nomber = 0;
		ArrayList<Reader> result = new ArrayList<Reader>();
		for(int i = 0; i < listOfR.size(); i++){
			if( maxBooks < listOfR.get(i).getFinishedPaper()){
				maxBooks = listOfR.get(i).getFinishedPaper();//I've found maxcount of books
				nomber = i;				
			}			
		}
		result.add(listOfR.get(nomber));	
		for(int i = 0; i < listOfR.size(); i++){
			if( maxBooks == listOfR.get(i).getFinishedPaper() && i != nomber){// Find all readers with equal count of books!
				result.add(listOfR.get(i));
			}
		}
		return result;	
	}
	
	//TODO сделать это внутренним классом!!
	public boolean parsingData(String line, ArrayList<String> list ){
		boolean valid_paper = true;	
		for(String r : line.split(";")){
			String a = r.trim();
			list.add(a);
			System.out.println(a);
			if(a.equals("null")){
				valid_paper = false;
				System.out.println("It isn't valid paper!");
			}
			
		}
		return valid_paper;
		//TODO свой exception!! может добавить базу данных!
		//TODO  разбить на две функции!!
	}
	
	public Paper createPaper(ArrayList<String> list){
		System.out.println("YES!");
		Paper paper = null;
		if(list.get(6) == "книга"){
			//TODO
			paper = new Book(list.get(1), list.get(2), 0, 2012, 1, 12 );
		}
		else{
			//TODO
			paper = new Newspaper( list.get(2), 0, 2012, 1, 13, list.get(1));			
		}		
		return paper;	
	}
	
	public static void  main(String []args)  throws IOException{
	
		Library.readFile( "//src", null);
		
	}
	
	static void readFile(String  location, Paper []p ) throws IOException{	
		
		ArrayList<String> list = new ArrayList<String>();
		File file = new File(location);
		try( FileReader fr = new FileReader(file); BufferedReader reader = new BufferedReader(fr) ) {															
			String line = reader.readLine();
			while(line != null){					
			//	if(parsingData(line, list)){//TODO think about name!!
			//		 createPaper(list);//TODO arraylist
			//	}
				line = reader.readLine();
			}
		}
		catch(FileNotFoundException e){				
			//System.out.println(e.getStackTrace());
			e.printStackTrace();
			//JOptionPane.showMessageDialog(null, "File don't find");	
		}
//		finally{
//			fr.close();
//			reader.close();
//		}
	}
}
