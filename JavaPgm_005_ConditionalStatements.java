package learing_basics;

public class JavaPgm_005_ConditionalStatements {
	
	/*Statements are of different types
		1. Conditional Statements
		2. Looping /iterative Statements
		3. Jumping Statements
		
		if you want the particular piece or line of code only when certain conditions are met, then use the conditional statements.
	*/
	
	
	/* 4 types of conditional statements 
		1. If
		2. If else
		3. Nested If
		4. Switch case
	*/
	public static void main(String[] args) {
		if_CondiCheck();
		ifElse_CondiCheck();
		nestedIf_CondiCheck();
		switchCase_CondiCheck();
	}
	
	static void if_CondiCheck() {
		
		boolean flag=false;
		String name="Ak";
		int a=15,b=20;
		char c='a';
		
		if (flag==false) {
			System.out.println("falg is enabled:"+flag);
		}
		
		if (name=="Ak") {
			System.out.println("name is :" +name);
		}
		
		if(a<b) {
			System.out.println("a is greater than b");
		}
		System.out.println("simple if program");
		if(c=='a') {
			System.out.println("char c value is :"+c);
		}
	}
	
	static void ifElse_CondiCheck()
	{
		
		int ageForVote=18;
		int Person_age=18;
		if(Person_age>=ageForVote)
		{
			System.out.println("Person is eligible to cast vote");
		}
		else 
		{
			System.out.println("Person is not eligible to cast vote");
		}
	}
	
	static void nestedIf_CondiCheck() {
		int a= 35, b=20, c=30;
		
		if(a>b && a>c)
		{
			System.out.println("A is the largest number");
		}
		else if (b>a && b>c) 
		{
		System.out.println("B is the largest number");	
		}
		else 
		{
			System.out.println("C is the largest number");
		}
	}
	
	static void switchCase_CondiCheck() {
		int day=5;
		switch(day) {
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("Saturday");break;
		default: System.out.println("Given No of Day is not within Week");
		}
		
		String DayName="Sunday";
		switch(DayName) {
		case "Sunday":   System.out.println("First Day in the Week");break;
		case "Monday":   System.out.println("Second Day in the Week");break;
		case "Tuesday":  System.out.println("Third Day in the Week");break;
		case "Wednesday":System.out.println("Fourth Day in the Week");break;
		case "Thursday": System.out.println("Fifth Day in the Week");break;
		case "Friday":   System.out.println("Sixth Day in the Week");break;
		case "Saturday": System.out.println("Seventh Day in the Week");break;
		default: System.out.println("No such day present in the week");
		}
	}
}
