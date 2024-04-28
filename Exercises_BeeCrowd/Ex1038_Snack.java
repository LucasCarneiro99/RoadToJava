package RoadToJava.Exercises_BeeCrowd;

import java.util.Scanner;

public class Ex1038_Snack {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int c,q;
		double a;
		c = sc.nextInt();
		q = sc.nextInt();
		switch (c) {
		case 1:
		a = 4.00*q;
		System.out.printf("Total: R$ %.2f", a);
		System.out.println();
		break;
		case 2:
		a = 4.50*q;
		System.out.printf("Total: R$ %.2f", a);
		System.out.println();
		break;
		case 3:
		a = 5.00*q;
		System.out.printf("Total: R$ %.2f", a);
		System.out.println();
		break;
		case 4:
		a = 2.00*q;
		System.out.printf("Total: R$ %.2f", a);
		System.out.println();
		break;
		case 5:
		a = 1.50*q;
		System.out.printf("Total: R$ %.2f", a);
		System.out.println();
		break;
		}
		sc.close();
	}

}
