package exercises;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double R, A;
		R = sc.nextDouble();
		A = (pi*(Math.pow(R, 2)));
		System.out.printf("A=%.4f\n",  A);		
		sc.close();

	}

}
