package desafio01Java;
import java.util.Scanner;
public class Ex14 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int valor = sc.nextInt();
		if(valor == 0) {
			System.out.println("� zero >:(");
		}
		else {
			if(valor>0) {
				System.out.println("O n�mero � positivo! "+Math.sqrt(valor)+" � a ra�z quadrada dele");
			}
			else {
				System.out.println("O n�mero � negativo! "+Math.pow(valor,2)+" � o quadrado dele");
			}
		}
		sc.close();
	}
}