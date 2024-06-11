package desafio01Java;
import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Conversor de nota");
		System.out.print("Digite a nota: ");
		byte nota = sc.nextByte();
		if(nota>=9) {
			System.out.println("Nota A!");
		}
		else {
			if(7<=nota && nota<9) {
				System.out.println("Nota B");
			}
			else {
				if(5<=nota && nota<7) {
					System.out.println("Nota C");
				}
				else {
					if(3<=nota && nota<5) {
						System.out.println("Nota D");
					}
					else {
						System.out.println("Nota F");
					}
				}
			}
		}
		sc.close();
	}
}
