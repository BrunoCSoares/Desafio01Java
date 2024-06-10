package desafio01Java;
import java.util.Scanner;
public class Ex3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int valor1 = sc.nextInt();
		System.out.print("Digite um número inteiro: ");
		int valor2 = sc.nextInt();
		if(valor1>valor2) {
			System.out.println(valor1 + " é maior!");
		}
		else if(valor1==valor2){
			System.out.println("Os dois são iguais!");
		}
		else {
			System.out.println(valor2 + " é maior!");
		}
	sc.close();
	}
}