package desafio01Java;
import java.util.Scanner;
public class Ex6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ano bissexto");
		System.out.print("Digite qual é o ano que deseja saber: ");
		int ano = sc.nextInt();
		if (ano%100==0) {
			if (ano%400==0) {
				System.out.println("É bissexto");
			}
			else {
				System.out.println("Não é bissexto");
			}
		}
		else {
			if (ano%4==0) {
				System.out.println("É bissexto");
			}
			else {
				System.out.println("Não é bissexto");
			}
		}
		sc.close();
	}
}