package estudos;

import java.util.Scanner;

public class Ex1004_SimpleProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,b, prod;
		a=sc.nextInt();
		b=sc.nextInt();
		prod = a*b;
		System.out.println("PROD = " + prod);
		sc.close();
	}

}
