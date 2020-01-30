package generic.classes.methods.interfaces;

 class Test<T,U> {
	 T obj1;  // An object of type T 
	    U obj2;  // An object of type U 
	  
	    // constructor 
	    Test(T obj1, U obj2) 
	    { 
	        this.obj1 = obj1; 
	        this.obj2 = obj2; 
	    } 
	  
	    // To print objects of T and U 
	    public void print() 
	    { 
	        System.out.println(this.obj1); 
	        System.out.println(this.obj2); 
	    } 
	} 
	  
	// Driver class to test above 
	public class Main 
	{ 
	    public static void main (String[] args) 
	    { 
	        Test <String, Integer> obj = 
	            new Test<String, Integer>("GfG", 15); 
	  
	        obj.print(); 
	    } 

}
