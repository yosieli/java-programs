package mvcDesign;

// controller class

public class StudentController {
	private Student model;
	private StudentView view;
	String a = Student.getName();

	   public StudentController(Student model, StudentView view){
	      this.model = model;
	      this.view = view;
	   }

	   public Student getModel() {
		return model;
	   }

	   public void setModel(Student model) {
		this.model = model;
	  }

	  public StudentView getView() {
		return view;
	 }

	 public void setView(StudentView view) {
		this.view = view;
	 }

	public void setStudentName(String name){
	      model.setName(name);		
	   }

	   public String getStudentName(){
	      return model.getName();		
	   }

	   public void setStudentRollNo(String rollNo){
	      model.setRollNo(rollNo);		
	   }

	   public String getStudentRollNo(){
	      return model.getRollNo();		
	   }

	   public void updateView(){				
	      view.printStudentDetails(getStudentName(), getStudentRollNo());
	   }	
	   
	   

}
