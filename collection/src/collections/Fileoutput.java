package collections;

import java.io.File;
import java.io.FileOutputStream;

public class Fileoutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try{
        	FileOutputStream  f=new FileOutputStream("E:\\this1.txt");
        	f.write(66);
        	f.close();
        	System.out.println("success");
          } 
        catch(Exception e)
        {
        	System.out.println(e);
        }
	}

}
