package learing_basics;

public class AssignmentSwapping2Numbers {
	
	public static void main(String[] args) {
		int a= 10,b=20;
		System.out.println("The value of a before swapping is :"+a);
		System.out.println("The value of b befoer swapping is :"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The value of a after swapping is :"+a);
		System.out.println("The value of b after swapping is :"+b);
		
		
		// approach 2: using temp variable
		
		int p=10, q=20;
		System.out.println("the value of p is :"+p+ "and the value of q is :"+q);
		int r=p;
			p=q;
			q=r;
		System.out.println("the value of p is :"+p+ "and the value of q is :"+q);
		
	}

}
