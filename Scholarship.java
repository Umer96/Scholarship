import java.util.Scanner;



public class Scholarship {
	public static void main (String arg[]) {
	/*
	 * Three conditions need to be satisfied in order to be considered for scholarship
	 * 1)ABC 2)ABE       3)ABF (Dean for consideration)
	 * 4)ACD 5)ADE       6) ADF (Dean for consideration)
	 */
	
	Scanner in = new Scanner (System.in);
	
	//All these 6 statements need to be filled before the if-else statement will be executed.
	System.out.println("A. Enter age of the student: ");
	int ageOfStudent = in.nextInt();
	
    System.out.println("B. Has lived in California for last 2 years? Enter 1 for true, or 0 for false ");
    int yearsLivedInCalifornia = in.nextInt();
    if(yearsLivedInCalifornia != 0 && yearsLivedInCalifornia != 1)
    {
        System.out.println("Error invalid values");
        System.exit(1);
    }
	
	System.out.println("C. Enter number of months has worked part time in the relevant field of study: ");
	int partTimeWork = in.nextInt();
	
	System.out.println("D. Enter number of years student's parents has paid CA state tax in their lifetime: ");
	int parentsStateTax = in.nextInt();
	
	System.out.println("E. Has volunteered for a cause and has a valid proof of it? (1/0): ");
	System.out.println("1 is true, and 0 is false");
    int volunteered = in.nextInt();
    if(volunteered != 0 && volunteered != 1)
    {
        System.out.println("Error invalid values");
        System.exit(1);
    }
	
	System.out.println("F. Enter household income per annum: ");
	int householdIncomePerAnnum = in.nextInt();
	
	/*
	 * This if else statement checks the age, if the age is not between 18 (inclusive) and 24 (inclusive)
	 * the application for scholarship will get rejected.
	 */
	if (ageOfStudent >= 18 && ageOfStudent <= 24) {
		
		/*
		 * This if-else statement will be executed if age is between between 18 (inclusive) and 24 (inclusive). 
		 * This if else statement checks if the applicant has lived in CA for atleast 2 years if not 
		 * then it will for if parents has paid tax in CA for atleast 1 year. If both conditions fail
		 * the student will get rejected.
		 */
		if (yearsLivedInCalifornia ==1) {
			
			/*
			 * This if else statement checks if the applicant household/annum is more than 5K, if not then
			 * a special will be considered, and a message will be displayed, "Dean for consideration".
			 */
            if(partTimeWork < 6)
            {
                if (volunteered == 1) {
                    System.out.println("Eligible for scholarship!"); //ABE
                }
                else if(householdIncomePerAnnum <= 5000)
                {
                    System.out.println("Dean for consideration"); //ABF
                }
                else {
                    System.out.println("Not Eligible");
                }
            }
            else
            {
                System.out.println("Eligible for scholarship!"); //ABC
            }
				
		}
		else
			
			/*
			 * If parents have paid income tax in CA for at least 1 year than the program will continue
			 * or else the program will reject the applicant.
			 */
            if (partTimeWork < 6)
            {
                    
                if (parentsStateTax >= 1) {

                    /*
                    * This if else statement checks if the applicant household/annum is more than 5K, if not then
                    * a special will be considered, and a message will be displayed, "Dean for consideration".
                    */
                    if (volunteered == 1)
                    {
                        System.out.println("Eligible for scholarship!"); //ADE
                    }
                    else if (householdIncomePerAnnum <= 5000)
                    {
                        System.out.println("Dean for consideration"); //ADF
                    }
                   
                }
                else 
                {
                    System.out.println("Not eligible");
                }
                
            }
            else if(partTimeWork > 6 && parentsStateTax >= 1)
            {
                System.out.println("Eligible for scholarship!"); //ACD
            }
            else
            {
                System.out.println("Not eligible");
            }
    }       
	else {
		System.out.println("Not eligible");
	}
	
	in.close();
    }
}