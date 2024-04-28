package RoadToJava.Exercises_BeeCrowd;

import java.util.Scanner;

public class Ex1035_SelectionTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,b,c,d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		if (a%2==0) {
			if (c>=0 && d>=0) {
				if (b>c) {
					if (d>a) {
						if (c+d>a+b) {
							System.out.println("Valores aceitos");
						}else {
							System.out.println("Valores nao aceitos");
						}
					}else {
						System.out.println("Valores nao aceitos");
					}
				}else {
					System.out.println("Valores nao aceitos");
				}
			}else {
				System.out.println("Valores nao aceitos");	
			}
		}else {
			System.out.println("Valores nao aceitos");
		}
		
		sc.close();
	}

}
