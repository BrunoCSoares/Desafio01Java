package desafio01Java;
import java.util.Scanner;
public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o peso em quilos: ");
		float peso = sc.nextFloat();
		System.out.print("Informe a altura em metros: ");
		float altura = sc.nextFloat();
		float imc = peso/(altura*altura);
		String resu=(imc<18.5)?"Abaixo do peso":(18.5<=imc&&imc<24.9)?"Peso normal":(25<=imc&&imc<29.9)?"Sobrepeso":(30<=imc&&imc<34.9)?"Obesidade grau I":(35<=imc&&imc<39.9)?"Obesidade grau II":"Obesidade grau III";
		System.out.println(imc+resu);
		sc.close();
	}
}
