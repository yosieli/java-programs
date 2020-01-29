package udemy.classes.objects;

public class Human {
  String name;
  int age;
  
  public Human( String name, int age){
	  this.name = name;
	  this.age = age;
	  
  }
  
  public void speak(){
	  System.out.println("my name is " + name);
	  System.out.println("I am " + age + "years's old!");
  }
}

