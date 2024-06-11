package desafio01Java;
import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Verificador de valores");
		System.out.print("Informe o valor: ");
		byte valor = sc.nextByte();
		if(9<valor && valor<21) {
			System.out.println("Está no intervalo");
		}
		else {
			System.out.println("Não está no intervalo");
		}
		sc.close();
	}
}
