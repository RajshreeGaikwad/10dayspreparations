/*
 Program : "Develop  a  class  named  “TaxCalculator“ with a method named calculateTax with the following method parameters,
            VariableName   Data Type
              empName        String
              isIndian        boolean
              empSal        double
			This method should return a double taxAmount.
			The business logic for calculating the tax  is as follows, this has to be implemented inside the method,
			If the employee is not a Indian
			The calculator should throw a CountryNotValidException
			If the employee name is null or empty
			The calculator should throw a EmployeeNameInvalidException
			If  empSal is greater than one lakh and isIndian true
			taxAmount =empSal *8/100
			Otherwise  If  empSal  is between 50K and 1lakh and isIndian true
			taxAmount =empSal *6/100
			Otherwise  If  empSal  is between 30 and 50 Thousand  and isIndian true
			taxAmount =empSal *5/100
			Otherwise  If  empSal  is between 10 and 30 Thousand  and isIndian true
			taxAmount =empSal *4/100
			Otherwise
			The calculator should throw a TaxNotEligibleException.
			Develop a main class CalculatorSimulator  , implement the following logic in main method
			1.  Execute the calculateTax Method and print the tax amount as “Tax amount is “<Tax Amount>
			2.  In case the calculateTaxMethod throws exceptions, this method needs to catch the appropriate exception print the stack trace and display the following messages,
			a.  Country not valid:  “The employee should be an Indian citizen for calculating tax”
			b.  Employee name not valid:  “The employee name cannot be empty”
			c.  Not eligible for Tax calculation:“The employee does not need to pay tax”"
@Author   : Rajshree Gaikwad
@Date     :2nd March 2023			

*/
package PractiseAssignment6;


//declaring class

class TaxCalculator{
	public static double CalculateTax(String empName,boolean isIndian,double empSal )throws Exception{
		if (!isIndian)  //use if statement
		{
			//for creating exception of country not valid
			throw new Exception("CountryNotValidException");   
			}
		if (empName==null || empName.isEmpty()) {
			
			//for creating exception of employee name invalid
			
			throw new Exception ("EmployeeNameInvalidException");  
		}
		double taxAmount;
		//for checking If  empSal is greater than one lakhs  and isIndian true using if-else
		if (empSal > 100000) {
			taxAmount =empSal *8/100;
		}
		 //for checking If  empSal  is between 50K and 1lakh and isIndian true
		else if(empSal > 50000) {
			taxAmount =empSal *6/100;
		}
		 //for checking If  empSal  is between 30 and 50 Thousand  and isIndian true
		else if (empSal >30000) {
			taxAmount =empSal *5/100;
		}
		//for checking If  empSal  is between 10 and 30 Thousand  and isIndian true using if-else
		else if (empSal >10000){
			taxAmount =empSal *4/100;
		}
		//for The calculator should throw a TaxNotEligibleException.
		else {
			throw new Exception(" TaxNotEligibleException");  //creating tax not eligible exception
		}
		return taxAmount;
		
	}
} //end of class


//declaring main class
public class CalculatorSimulator {

	//calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	double taxAmount=TaxCalculator.CalculateTax("Rajshree", true, 60000);
	//double taxAmount=TaxCalculator.CalculateTax("Rajshree", flase, 30000);  throws county not valid exception
	//double taxAmount=TaxCalculator.CalculateTax("Rajshree", true, 5000);  throws tax not eligible exception
	//double taxAmount=TaxCalculator.CalculateTax("", true, 60000); throws employee name invalid exception
	System.out.println("TAX AMOUNT IS:"+taxAmount);
	
} catch (Exception e) {   
	// handle exception
	if(e.getMessage().equals("CountryNotValidException")) 
	{   // its throws this exception when country is false
		System.out.println(" Country not valid:  The employee should be an Indian citizen for calculating tax");
	}
	else if (e.getMessage().equals("EmployeeNameInvalidException")) 
	{  
		//its throws when empName is null or empty
		System.out.println(" Employee name not valid: The employee name cannot be empty");
		
	}
	else if (e.getMessage().equals("TaxNotEligibleException")) 
	{  //its throws when empSal is less than 10000
		System.out.println("  Not eligible for Tax calculation:“The employee does not need to pay tax");
	}
	e.printStackTrace();
}
	} //end of main method

} //end of class