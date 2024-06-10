package desafio01Java;
import java.util.Scanner;
public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Fase da vida");
		System.out.print("Informe a idade desejada: ");
		byte idade = sc.nextByte();
		if (idade<13) {
			System.out.println("É uma criança");
		}
		else {
			if(12<idade && idade<18) {
				System.out.println("É um adolescente");
			}
			else {
				if(17<idade && idade<60) {
					System.out.println("É um adulto");
				}
				else {
					System.out.println("É um idoso");
				}
			}
		}
		sc.close();
	}	
}
