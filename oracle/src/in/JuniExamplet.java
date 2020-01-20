package in;
import static org.junit.Assert.*;  

import org.junit.Test;  
import static org.junit.Assert.assertEquals;
class Calculation {  
	  
    public static int findMax(int arr[]){  
        int max=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
}  
public class JuniExamplet {
 
	
		// TODO Auto-generated method stub
@Test
		 public void testFindMax(){  
		        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
		        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
		    }  

	

}

