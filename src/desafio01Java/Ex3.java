package desafio01Java;
import java.util.Scanner;
public class Ex3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int valor1 = sc.nextInt();
		System.out.print("Digite um n�mero inteiro: ");
		int valor2 = sc.nextInt();
		if(valor1>valor2) {
			System.out.println(valor1 + " � maior!");
		}
		else if(valor1==valor2){
			System.out.println("Os dois s�o iguais!");
		}
		else {
			System.out.println(valor2 + " � maior!");
		}
	sc.close();
	}
}