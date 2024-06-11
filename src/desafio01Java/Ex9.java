package desafio01Java;
import java.util.Scanner;
public class Ex9 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Leitor de código de produto");
	System.out.print("Informe o código do produto: ");
	byte cod = sc.nextByte();
	String categoria = (0<cod&&cod<=10)?"alimento não perecível":(10<cod&&cod<=20)?"alimento prececível":(20<cod&&cod<=30)?"vestuário":(30<cod&&cod<40)?"eletrônicos":"inválido";
	System.out.println("A categoria do produto é "+categoria);
	sc.close();
	}
}
