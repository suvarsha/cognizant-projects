package collections;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
	//	FileWriter  w=new  FileWriter("E:\\this1.txt");	
	//	w.write("this is suvarsha");
		//w.close();
		FileReader r=new FileReader("E:\\this1.txt");
	int i;
	while((i=r.read()) != -1)	
	{
		System.out.print((char)i);
	}
	
	    System.out.println(" \n Success");  
	}

}
