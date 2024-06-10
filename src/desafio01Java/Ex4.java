package desafio01Java;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Validação de um triângulo");
		System.out.print("Digite o primeiro lado: ");
		int lado1 = sc.nextInt();
		System.out.print("Digite o segundo lado: ");
		int lado2 = sc.nextInt();
		System.out.print("Digite o terceiro lado: ");
		int lado3 = sc.nextInt();
		String resultado = (lado1>lado2+lado3) || (lado2>lado1+lado3) || (lado3>lado1+lado2) ? "Não forma um triângulo" : "Fomra um triâgulo!";
		System.out.println(resultado);
	sc.close();
	}
}
