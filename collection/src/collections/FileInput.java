package collections;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	FileInputStream f=new FileInputStream("E:\\this1.txt");
	f.read();
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}