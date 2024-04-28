package RoadToJava.Exercises_BeeCrowd;
import java.util.Scanner;

public class Ex3303_BigWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String x;
		x = sc.nextLine();
		if (x.length() >= 10) {
			System.out.println("palavrao");
		} else {
			System.out.println("palavrinha");
		}
		sc.close();
	}

}
