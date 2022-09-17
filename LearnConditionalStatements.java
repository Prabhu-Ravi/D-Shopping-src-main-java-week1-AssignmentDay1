package week1.day1;

public class LearnConditionalStatements {

	public static void main(String[] args) {
		int age = 89;
		 if (age>=60) {
			System.out.println("Senior Citizen");
			if(age > 80) {
				System.out.println("80+");
	     }
	}
	     
	    else if (age >= 18)
		    System.out.println("Eligible to Driving");
		else
			System.out.println("Age is less than 18");

	}

}
