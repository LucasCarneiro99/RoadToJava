package RoadToJava.Exercises_BeeCrowd;
import java.util.Scanner;
//Calculate the area of a circle
public class Ex1002_AreaOfCircle {

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
