package desafio01Java;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int valor = sc.nextInt();
		if(valor%2 == 0) {
			System.out.println("O n�mero � par!");
		}
		else {
			System.out.println("O n�mero � �mpar!");
		}
		sc.close();
	}
}