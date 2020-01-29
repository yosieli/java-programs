package mvcDesign;

//model class
public class Student {
	private String rollNo;
	private static String name;
	   
	   public String getRollNo() {
	      return rollNo;
	   }
	   
	   public void setRollNo(String rollNo) {
	      this.rollNo = rollNo;
	   }
	   
	   public static String getName() {
	      return name;
	   }
	   
	   public void setName(String name) {
	      this.name = name;
	   }
  
}
