package desafio01Java;
import java.util.Scanner;
public class Ex14 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int valor = sc.nextInt();
		if(valor == 0) {
			System.out.println("é zero >:(");
		}
		else {
			if(valor>0) {
				System.out.println("O número é positivo! "+Math.sqrt(valor)+" é a raíz quadrada dele");
			}
			else {
				System.out.println("O número é negativo! "+Math.pow(valor,2)+" é o quadrado dele");
			}
		}
		sc.close();
	}
}