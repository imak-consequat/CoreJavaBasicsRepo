package learing_basics;

public class JavaPgm_003_DataTypes {
	
	//public is access modifier
	// class is keyword to identify class 
	
	
	public static void main(String[] args) {
		/* Data types are of two types 
			1. Primitive data types
			2. Non-primitive data types
			Primitive are use to store single values 
			whereas non-promitive used to store series of values */
		
		// Primitive types are as follows 
		byte by=127;
		short sh=3535;
		int in=9095555;
		long l=5587566756755L; // for long need to add L at last to mark its data type as Long
		double d= 99.999;
		float fl=7856.765F; // for long need to add F at last to mark its data type as float
		boolean b=true;
		char c='a';
		System.out.println("byte values is :"+by);
		System.out.println("short values is :"+sh);
		System.out.println("int values is :"+in);
		System.out.println("long values is :"+l);
		System.out.println("doubole values is :"+d);
		System.out.println("float values is :"+fl);
		System.out.println("boolean values is :"+b);
		System.out.println("Char values is :"+c);
		
		
		// Non-primitive
		
		String s= "Ashok";
	
		//Hash map
		//hash Set
		
		System.out.println("Steing value is :"+s);
	
		
		
	}

}
