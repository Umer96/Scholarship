package sjsu.edu;

import java.util.Scanner;

public class ScholarshipConsideration {
	public static void main (String arg[]) {
	/*
	 * Three conditions need to be satisfied in order to be considered for scholarship
	 * 1)ABC 2)ABE 3)ABF
	 * 4)ADC 5)ADE 6) ADF
	 * There are 6 cases in total to get a scholarship
	 */
	
	Scanner in = new Scanner (System.in);
	
	//All these 6 statements need to be filled before the if-else statement will be executed.
	System.out.println("A. Enter age of the student: ");
	int ageOfStudent = in.nextInt();
	
	System.out.println("B. Enter number of years student has lived in California: ");
	int yearsLivedInCalifornia = in.nextInt();
	
	System.out.println("C. Enter number of months has worked part time in the relevant field of study: ");
	int partTimeWork = in.nextInt();
	
	System.out.println("D. Enter number of years student's parents has paid CA state tax in their lifetime: ");
	int parentsStateTax = in.nextInt();
	
	System.out.println("E. Has volunteered for a cause and has a valid proof of it? (1/0): ");
	System.out.println("1 is true, and 0 is false");
	int volunteered = in.nextInt();
	
	System.out.println("F. Enter household income per annum of students: ");
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
		if (yearsLivedInCalifornia >= 2) {
			
			/*
			 * This if else statement checks if the applicant household/annum is more than 5K, if not then
			 * a special will be considered, and a message will be displayed, "Dean for consideration".
			 */
			if(householdIncomePerAnnum >= 5000) {
				
				/*
				 * This will ask about their part time work (in months), if it is not more than or equal to 
				 * 6 months then it will ask if student has a verification document to proof it.
				 */
				if(partTimeWork < 6) {
					
					if (volunteered == 1) {
						System.out.println("You got scholarship!");
					}
					else {
						System.out.println("You got scholarship!");
					}
				}
				else {
					System.out.println("Dean for consideration");
				}
			}
			else
				System.out.println("You got scholarship!");
		}
		else
			
			/*
			 * If parents have paid income tax in CA for at least 1 year than the program will continue
			 * or else the program will reject the applicant.
			 */
			if (parentsStateTax >= 1) {

				/*
				 * This if else statement checks if the applicant household/annum is more than 5K, if not then
				 * a special will be considered, and a message will be displayed, "Dean for consideration".
				 */
				if(householdIncomePerAnnum >= 5000) {
					
					/*
					 * This will ask about their part time work (in months), if it is not more than or equal to 
					 * 6 months then it will ask if student has a verification document to proof it.
					 */
					if(partTimeWork < 6) {
						
						if (volunteered == 1) {
							System.out.println("You got scholarship!");
						}
						else {
							System.out.println("You got scholarship!");
						}
					}
					else {
						System.out.println("You got scholarship!");
					}
				}
				else
					System.out.println("Dean for consideration");
			}
			else {
				System.out.println("Not eligible");
			}
				
	}
	else {
		System.out.println("Not eligible");
	}
	
	in.close();
}
}