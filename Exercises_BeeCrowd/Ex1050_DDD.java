package exercises;

import java.util.Scanner;

public class Ex1050_DDD {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int ddd;
		ddd = sc.nextInt();
		switch (ddd) {
		case 11:
			System.out.println("Sao Paulo");
			break;
		case 71:
			System.out.println("Salvador");
			break;
		case 61:
			System.out.println("Brasilia");
			break;
		case 21:
			System.out.println("Rio de Janeiro");
			break;
		case 31:
			System.out.println("Belo Horizonte");
			break;
		case 27:
			System.out.println("Vitoria");
			break;
		case 19:
			System.out.println("Campinas");
			break;
		case 32:
			System.out.println("Juiz de Fora");
			break;
		default:
			System.out.println("DDD nao cadastrado");
		}
		
		sc.close();
	}

}
