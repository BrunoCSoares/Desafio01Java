package desafio01Java;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um valor: ");
		short valor = sc.nextShort();
		if(valor>100) {
			System.out.println(valor+" � maior que 100");
		}
		else {
			System.out.println(valor+" n�o � maior que 100, "+valor*2+" � o dobro dele");
		}
		sc.close();
	}
}
