package desafio01Java;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int valor = sc.nextInt();
		if(valor>0) {
			System.out.println("O n�mero � positivo!");
		}
		else if(valor==0){
			System.out.println("O n�mero � zero!");
		}
		else {
			System.out.println("O n�mero � negativo!");
		}
		sc.close();
	}
}