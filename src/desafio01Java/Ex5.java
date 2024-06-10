package desafio01Java;
import java.util.Scanner;
public class Ex5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Média de um aluno");
		System.out.print("Digite a primeira nota: ");
		int nota1 = sc.nextInt();
		System.out.print("Digite a segunda nota: ");
		int nota2 = sc.nextInt();
		System.out.print("Digite a terceira nota: ");
		int nota3 = sc.nextInt();
		float media = (nota1+nota2+nota3)/3;
		String fimDoAno = (media>=7)?"Aluno aprovado!":(media<5)?"Aluno reprovado":"Aluno em recuperação";
		System.out.println(fimDoAno);
		sc.close();
	}
}