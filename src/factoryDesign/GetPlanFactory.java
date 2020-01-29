package factoryDesign;

public class GetPlanFactory {
	//use getPlan method to get object of type Plan   
    /*public Plan getPlan(String planType){  
         if(planType == null){  
          return null;  
         }  
    
       if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
              return new DomesticPlan();  
            }   
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
             return new CommercialPlan();  
         }   
       else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
             return new InstitutionalPlan();  
       }  
   return null;  
  }  */
	
	public Plan getDomesticPlan(String planType){
		return new DomesticPlan();
	}
	
	public Plan getCommercialPlan(String planType){
		return new CommercialPlan();
	}
	
	public Plan getInstitutionalPlan(){
		return new  InstitutionalPlan(); 
	}
	
	
	

}
