package desafio01Java;
import java.util.Scanner;
public class Ex9 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Leitor de c�digo de produto");
	System.out.print("Informe o c�digo do produto: ");
	byte cod = sc.nextByte();
	String categoria = (0<cod&&cod<=10)?"alimento n�o perec�vel":(10<cod&&cod<=20)?"alimento precec�vel":(20<cod&&cod<=30)?"vestu�rio":(30<cod&&cod<40)?"eletr�nicos":"inv�lido";
	System.out.println("A categoria do produto � "+categoria);
	sc.close();
	}
}
