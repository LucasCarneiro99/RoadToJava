package exercises;

import java.util.Scanner;

//Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X. 
public class Ex1001_ExtremelyBasic {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,b,x;
		a = sc.nextInt();
		b = sc.nextInt();
		x = a+b;
		System.out.println("X = " + x);
		sc.close();
	}

}
