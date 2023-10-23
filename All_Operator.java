/*

Date:-23-10-2023	Time:- 6:47 PM
Aim:- To perform Java Operators

*/
import java.util.Scanner;

class Operator
{
	static int x,y;
	public static void main(String[] args)
	{
		System.out.println("Welcome To Java Operators:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter FIRST Value ");
		int x=sc.nextInt();
		System.out.println("Please Enter SECOND Value");
		int y= sc.nextInt();
		System.out.println(" x = " + x + "\n y = "+ y + "\n------------*------------");
	



		//Arithmatic Operator 

		System.out.println("Welcome TO Arithmatic Operators:"+ "\n------*------");
		System.out.println("Addition :");
		int z=(x+y);
		System.out.println("x="+ x+ "  "+ "y="+y);
		System.out.println("z = x + y \n z="+ z);
		System.out.println("-----*-------");

		System.out.println("Subtraction :");
		z=(x-y);
		System.out.println("x="+ x+ "  "+ "y="+y);
		System.out.println("z= x - y");
		System.out.println("z= "+ (x-y));
		System.out.println("-----*-------");

		System.out.println("Division :");
		z=(x/y);
		System.out.println("x="+ x+ "  "+ "y="+y);
		System.out.println("z= x / y");
		System.out.println("z= "+ (x/y));
		System.out.println("-----*-------");
		
		System.out.println("Modulo :");
		z=(x%y);
		System.out.println("x="+ x+ "  "+ "y="+y);
		System.out.println("z= x % y");
		System.out.println("z= "+ (x%y));
		System.out.println("-----*-------");
	



		//Ternary Operator
		
		System.out.println("---------------*----------------");
		System.out.println("Welcome TO Ternary Operators:"+ "\n------*------");
		System.out.println(" x = " + x + "\n y = "+ y + "\n-----*-------");
		
		int result=x>y? x+y: x-y;
		System.out.println("result=x>y? x+y: x-y");
		System.out.println("=x>y? x+y: x-y");
		System.out.println("result="+result);
		





		//Unary Operator
		
		System.out.println("---------------*----------------");
		System.out.println("Welcome TO Unary Operators:"+ "\n------*------");
		System.out.println(" x = " + x + "\n y = "+ y + "\n-----*-------");
	
		System.out.println("PREFIX" +"\n-------*-------");
		System.out.println("Pre-Increment :");
		z=++x;
		System.out.println(" z=++x;"+ "\n x="+ x);
		System.out.println(" z="+ z);
		
		System.out.println("Pre-Decrcrement :");
		System.out.println(" x = " + x + "\n y = "+ y + "\n-----*-------");
		z=--y;
		System.out.println(" z=--y;"+ "\n y="+ y);
		System.out.println(" z="+ z +"\n-------*------");
		
		System.out.println("POSTFIX" +"\n-------*-------");
		System.out.println("Post-Increment :");
		System.out.println(" x = " + x + "\n y = "+ y + "\n-----*-------");
		z=x++;
		System.out.println(" z=x++;"+ "\n z = "+ z);
		System.out.println(" x="+ x);

		System.out.println("Post-Decrcrement :");
		System.out.println(" x = " + x + "\n y = "+ y + "\n-----*-------");
		z=y--;
		System.out.println(" z=y--;"+ "\n z = " + z);
		System.out.println(" y="+ y);
		




		//Logical Bitwise Operator
		
		System.out.println("---------------*----------------");
		System.out.println("Welcome TO Logical - Bitwise  Operators:"+ "\n------*------");
		
		//Logical && Operator
		System.out.println("Logical && AND Operators:");
		System.out.println(" x = " + x + "\n y = "+ y + "\n z = " + z + "\n-----*-------"); 
		System.out.println("(x>y) && (++z>y) = "+ (x>y && ++z>y));
		System.out.println("int z =" + z + "\n ----*----");

		//Bitwise AND 
		System.out.println(" Bitwise & AND  Operators:"+ "\n------*------");
		System.out.println("(x>y) & (++z>y)=" +(x>y & ++z>y));   
		System.out.println("int z = " + z + "\n----*----"); 
		
		//Logical || OR  
		System.out.println("Welcome TO Logical - Bitwise  Operators:"+ "\n------*------");
		System.out.println("Logical || OR Operators:");
		System.out.println(" x = " + x + "\n y = "+ y + "\n z = " +z + "\n-----*-------"); 
		System.out.println("(x>y) || (++z>y) =" +(x>y || ++z>y));
		System.out.println("int z = "+z +"\n--------*--------"); 


		//Bitwise | OR 
		System.out.println("Welcome TO Logical Bitwise  Operators:"+ "\n------*------");
		System.out.println("Bitwise | OR Operators:");
		System.out.println(" x = " + x + "\n y = "+ y + "\n z = " +z + "\n-----*-------");
		System.out.println("(x<y) | (++z>y)="+(x<y | ++z>y));
		System.out.println("int z = " +z); 
		



			
		//Shift Operators
		System.out.println("---------------*----------------");
		System.out.println("Welcome TO Shift  Operators:"+ "\n------*------");

		//Left Operator(<<)
		System.out.println("Left Shift (<<) Operators:");
		System.out.println(" x = " + x + "\n y = "+ y + "\n z = " + z + "\n-----*-------"); 
		System.out.println("x<<3 \n =x*2^3=x*8=x<<3="+(x<<3) +"\n-----*-------"); 

		//Right Operator(>>)
		System.out.println("Right Shift (>>) Operators:");
		System.out.println(" x = " + x + "\n y = "+ y + "\n z = " + z + "\n-----*-------"); 
		System.out.println("y>>3 \n =y/2^3=y/8=x>>3="+(x>>3)+"\n-----*-------");
		

		//Unsigned Right Operator(>>>)
		System.out.println(" Unsigned Right Shift (>>>) Operators:");
		System.out.println(" x = " + x + "\n y = "+ y + "\n z = " + z + "\n-----*-------"); 
		System.out.println("z>>>2 = z%2^2 = z%4 = " + (z>>>2)); 
		

		

		//Assignment Operator
		
		System.out.println("---------------*----------------");
		System.out.println("Welcome TO Assignment Operators:"+ "\n------*------");
		System.out.println(" x = " + x + "\n y = "+ y + "\n z = " + z + "\n-----*-------"); 
		
		System.out.println(" x="+x + "\n x+=2 \n x=x+2 \n = x+2 "+ "\n = " + (x+=2) + "\n-----*-----");
		System.out.println(" y="+y +  "\n y-=2 \n y=y-2 \n = y-2 " + "\n = " + (y-=2) + "\n-----*-----");
		System.out.println(" z="+z + "\n z*=3 \n z=z*3 \n = z*3 "+ "\n = " + (z*=9) + "\n-----*-----");
		System.out.println(" x="+x + "\n x/=6 \n x=x/6 \n = x/6"+ "\n = " + (x/=6) + "\n-----*-----");
		System.out.println(" y="+y + "\n y%=5 \n y=y%5 \n = y%5"+ "\n = " + (y%=5) + "\n-----*-----");
		System.out.println(" x &= y \n x = "+(x&=y) +"\n false" + "\n -----*-----");
		System.out.println(" x |= y \n x = "+(x|=y) + "\n -----*-----"); 
		System.out.println(" x ^= y \n x = "+(x^=y) + "\n -----*-----");
		System.out.println(" z<<2 \n z=z<<2 \n = z<<2  \n = z*2^2 \n = z*4 \n =" + (z<<2) + "\n-----*-----");
		System.out.println("x>>2 \n x=x>>2 \n = x>>2  \n = x/2^2 \n = x/4 \n = " + (x>>2) + "\n-----*-----");




		//Relational Operator
		System.out.println("---------------*----------------");
		System.out.println("Welcome TO Relational Operators:"+ "\n------*------");
		
		//Equality Operator

		System.out.println(" Equality Operators:"); 
		System.out.println(" x = " + x + "\n y = "+ y + "\n z = " + z + "\n-----*-------");
		System.out.println("   (x==y)" + "\n-->"+ x +"==" +y + "\n   ="+(x==y)+ "\n------*------");
		System.out.println("   (x!=y)" + "\n-->"+ x +"!=" +y + "\n   ="+(x!=y)+ "\n------*------");

		//Comparision Operator
		System.out.println(" Comparision Operators:"); 
		System.out.println(" x = " + x + "\n y = "+ y + "\n z = " + z + "\n-----*-------");
		System.out.println("   (x>y)" + "\n-->"+ x +">" +y + "\n   ="+(x>y)+ "\n------*------");
		System.out.println("   (x>=y)" + "\n-->"+ x +">=" +y + "\n   ="+(x>=y)+ "\n------*------");
		System.out.println("   (x<y)" + "\n-->"+ x +"<" +y + "\n   ="+(x<y)+ "\n------*------");
		System.out.println("   (x<=y)" + "\n-->"+ x +"<" +y + "\n   ="+(x<y)+ "\n------*------");
		

		
	
		System.out.println("---------------*----------------");
		System.out.println(" Thank U ! For Visiting Java Operators !!!");
			
	}
}