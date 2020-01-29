package vector.arrayList.array;

//import java.util.ArrayList;
import java.util.*;

public class Vector_demo {
	
	static char data[] = {'a', 'b', 'c'};
    
    

	public static void main(String[] arg) 
    { 
        ArrayList arr = new ArrayList(); 
        arr.add(3); 
        arr.add("geeks"); 
        arr.add("forgeeks"); 
        arr.add(4); 
  
        // createn default vector 
        Vector v = new Vector(); 
  
        // copying all element of array list int0 vector 
        v.addAll(arr); 
  
        // checking vector v 
        System.out.println("vector v:" + v); 
        
        String str = new String(data);
        System.out.println(str); 
        
    } 

}
