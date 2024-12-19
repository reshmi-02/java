package org.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		File f = new File("E:\\oranium\\filehandling\\demo\\Rani\\raja ");
		
		 boolean present = f.exists();
		 System.out.println("Folder present : "+present);
		 if(present==false) {
//			 f.mkdir(); //used to create a single folder
			 f.mkdirs();
			 }
		 boolean present2= f.exists();
		 System.out.println("Folder Present :"+present2);
		 
		 File f2 = new File("E:\\oranium\\filehandling\\demo\\test.txt");
		 
		 boolean filepre = f2.exists();
		 System.out.println( filepre);
		 
		 if( filepre==false) {
			 boolean created = f2.createNewFile();
			System.out.println("File created :"+created); 
		 }
		 
		 File f3=new File("E:\\\\oranium\\\\filehandling\\\\demo\\\\test.txt");
		 f3.delete();
		 
		 boolean fd = f3.exists();
		 System.out.println("File delete :"+fd);
		 
	}
}
