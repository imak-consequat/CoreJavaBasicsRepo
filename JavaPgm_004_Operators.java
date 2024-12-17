package learing_basics;

public class JavaPgm_004_Operators {

	
	public static void main(String[] args) {
		
		/*
		1. Arithmetic Operators : + -  / * %
		2. Relational / Comparison Operators : >(greater than), >=(Greater than or equal to), < (less than), <=(less than or equal to), !=(not equal to), ==(equal to)
		3. Increment/decrement Operators : ++  --
		4. Logical Operators    : && || !
		5. Conditional or ternary Operator :  a>b)? d:c , if a greater then a value is assigned with d else c.
		6. Assignment Operators  : =, +=, -=, *=, %=, /=
		 
		
		commonly called as 
		1. Unary Operators single input operation
		2. Binary Operators needs two inputs to compare
		3. Ternary Operators condition ? if true value: if false value
		
		other operators are lambda, type cast, etc... java 8+ ...
		 */
		arithOps();
		relationalOps();
		incrementOps();
		decrementOps();
		otherOps();
		ternaryOps();
		logicalOps();
	}
	
	
	// Method Declaration 
	public static void arithOps() {
		System.out.println(" A R I T H M E T I C -- S T A R T S");
		//Variable declaration and values assignment 
		int a=10;
		int b=20;
		//Functional statements
		int sum = a+b;
		int sub = b-a;
		int mul = a*b;
		int div = b/a;
		int mod = b%a;
		// printing statements 
		System.out.println("Addition of values: "+a+"+"+b+"="+sum);
		System.out.println("Subtraction of values: "+b+"-"+a+"="+sub);
		System.out.println("Multiplication of values: "+a+"*"+b+"="+mul);
		System.out.println("Division of values: "+b+"/"+a+"="+div);
		System.out.println("Modulus of values: "+b+"%"+a+"="+mod);
		System.out.println(" A R I T H M E T I C -- E N D S");
		System.out.println("");
	}
	
	public static void relationalOps() {
		System.out.println(" R E L A T I O N A L -- S T A R T S");
		int a=30;
		int b=20;
		System.out.println("Value "+a+">"+b+":"+(a>b));
		System.out.println("Value "+a+">="+b+":"+(a>=b));
		System.out.println("Value "+a+"<"+b+":"+(a<b));
		System.out.println("Value "+a+"<="+b+":"+(a<=b));
		System.out.println("Value "+a+"!="+b+":"+(a!=b));
		System.out.println("Value "+a+"=="+b+":"+(a==b));
		System.out.println(" R E L A T I O N A L -- E N D S");
		System.out.println("");
	}
	
	public static void incrementOps() {
		System.out.println(" I N C R E M E N T A L -- S T A R T S");
		int a =10; 	System.out.println(a); // value of a before increment
		int e=a++; // post increment
		System.out.println(e); // Initial value of a has been assigned and then incremented so it will be initial value of a
		int c=a;	System.out.println("After post-inrement the value of a given to c is"+c);
		
		
		int b=20;	System.out.println("Before increment the value of b is:"+b);
		int f=++b; //pre-increment 
		System.out.println("After pre-Increment the value of b and assigned to f is:"+f);
		System.out.println(" I N C R E M E N T A L -- E N D S");
		System.out.println("");
	}
	
	public static void decrementOps() {
		int a =10; 	System.out.println(a); // value of a before increment
		int e=a--; // post decrement
		System.out.println(e); // Initial value of a has been assigned and then incremented so it will be initial value of a
		int c=a; 	System.out.println("After post-decrement the value of a given to c is"+c);
		
		
		int b=20; 	System.out.println("Before decrement the value of b is:"+b);
		int f=--b; //pre-decreement 
		System.out.println("After pre-decrement the value of b and assigned to f is:"+f);
	}
	
	static void otherOps(){
		
		int a=10;   System.out.println("Value of a initially is :"+a);
		a+=5;		System.out.println("Value of a after adding with 5 is :"+a);
		int b=10;   System.out.println("Value of b initially is :"+b);
		b-=5;		System.out.println("Value of b after subtracting with 5 is :"+b);
		int c=10;   System.out.println("Value of c initially is :"+c);
		c*=5;		System.out.println("Value of c after multiplying with 5 is :"+c);
		int d=10;   System.out.println("Value of d initially is :"+d);
		d/=5;		System.out.println("Value of d after dividing with 5 is :"+d);
		int e=10;   System.out.println("Value of e initially is :"+e);
		e%=5;		System.out.println("Value of e after Modulus with 5 is :"+e);
		
		
	}
	
	static void ternaryOps() {
		System.out.println(" T E R N A R Y -- S T A R T S");
		int a=20,b=25,c=a>b?a:b; // a>b condition is false, so the value of false assigned to c ie, value of c is 25
		System.out.println(c);
		int d=30,e=20,f=e<d?e:d; // e<d condition is true, so the value of true(e) assigned to f ie, value of f is 20
		System.out.println(f);
		int g=30,h=20,i=h<g?g:h; // e<d condition is true, so the value of true(e) assigned to f ie, value of f is 30
		System.out.println(i);
		System.out.println(" T E R N A R Y -- E N D S");
		System.out.println("");
	}
	
	static void logicalOps(){
		System.out.println(" L O G I C A L -- S T A R T S");
		int a=50,b=50,c=60,d=60;
		boolean alpha = a==b && c==d; // a and b are equal returns TRUE , c & d are equal so return TRUE >> && logic returns TRUE
		System.out.println(alpha); // true
		
		int E=50,F=60,G=60,H=60;
		boolean beta = E==F || G==H; // a and b are not equal returns FALSE , g & h are equal so return TRUE >> || logic returns TRUE
		boolean gama = E==F && G==H; // a and b are not equal returns FALSE , g & h are equal so return TRUE >> && logic returns FALSE
		boolean yama = E!=F; // e and f are not equal 
		boolean lama = G!=H; // g and h are equal 
		boolean mama = a==F &&b==H; // a and F not equal returns FALSE , b and H are not equal returns FLASE >> && logic returns FALSE
		System.out.println(beta); // true
		System.out.println(gama); // false
		System.out.println(yama); // true
		System.out.println(lama); // false
		System.out.println(mama); // false
		
		System.out.println(" L O G I C A L -- E N D S");
		System.out.println("");
	}
	

}
