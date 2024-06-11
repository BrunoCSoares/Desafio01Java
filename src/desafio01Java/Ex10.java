package desafio01Java;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora");
		System.out.print("Escreva o primeiro valor: ");
		byte valor1 = sc.nextByte();
		System.out.print("Escreva o segundo valor: ");
		byte valor2 = sc.nextByte();
		System.out.print("Informe a operação: multiplicação [1]; divisão [2]; adição[3]; subtração[4]: ");
		byte oper = sc.nextByte();
		if(oper==1) {
			System.out.println(valor1*valor2);
		}
		else {
			if(oper==2) {
				System.out.println(valor1/valor2);
			}
			else {
				if(oper==3) {
					System.out.println(valor1+valor2);
				}
				else {
					if(oper==4) {
						System.out.println(valor1-valor2);
					}
					else {
						System.out.println("Inválido");
					}
				}
			}
		}
		sc.close();
	}
}
