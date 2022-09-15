package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Vinicius", 25, 1.65);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();
		System.out.println("Digite sua idade: ");
		int idade= teclado.nextInt();
		System.out.println("Digite sua altura: ");
		double altura = teclado.nextDouble();
		
		
	}
	
		
}
