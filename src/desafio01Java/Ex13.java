package desafio01Java;
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o valor da compra: ");
		float compra = sc.nextFloat();
		System.out.println("Informe a categoria do cliente:");
		System.out.println("Cliente comum [1]");
		System.out.println("Associado     [2]");
		System.out.println("VIP           [3]");
		byte cliente = sc.nextByte();
		if(cliente==1) {
			System.out.println("valor final: "+compra);
		}
		else {
			if(cliente==2) {
				System.out.println("valor final: "+compra*0.9);
			}
			else {
				if(cliente==3) {
					System.out.println("valor final: "+compra*0.8);
				}
				else {
					System.out.println("Inválido");
				}
			}
		}
		sc.close();
	}
}
