package exceptionHandling;

import java.io.IOException;

public class TryCatchExample4  {
	
	void div() throws IOException{
		int a = 25/0;
		System.out.println(a);
	}
	
	public static void main(String[] args) {  
		TryCatchExample4 obj = new TryCatchExample4();
		try {
			obj.div();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
		    System.out.println(e1);
		}
		
		
        try  
        {  
        	  int arr[]= {1,3,5,7};  
              System.out.println(arr[10]); //may throw exception   
        }  
            // handling the exception by using Exception class      
       /* catch(Exception e)  
        {  
            System.out.println(e);  
        }  
        */
        catch(Exception e ){System.out.println(e);} 
        //System.out.println("rest of the code");
        
        finally{
        	System.out.println("finally block is always executed"); 
        }
        System.out.println("rest of the code");
        
    }  

}
