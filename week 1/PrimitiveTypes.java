public class PrimitiveTypes{

	public static void main(String args[]){
	

		//primitive types
		long l=78;
		short s=7;
		byte b=1;
		double d=4.5;
		float f=8.9f;
		int i=4;
		char c='c';
		boolean bool=true;
		//how to add currency comma, decimal align numbers, trim the rest of string
		
		System.out.printf("%-50s","Primitive data types are:\n");
		System.out.printf("\nvalue in long is %04d\n",l);
		System.out.print("value in short is:\n"+s);
		System.out.printf("value in byte is %d\n",b);
		System.out.printf("value in double is %.2f\n",d);
		System.out.printf("value in float is %f\n",f);
		System.out.printf("value in int is %d\n",i);
		System.out.printf("value in char is %c\n",c);
		System.out.printf("value in boolean is %s\n",bool);
		
	}

}